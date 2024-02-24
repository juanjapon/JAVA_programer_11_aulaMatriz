package com.aula.products.product.exception;

import com.aula.products.product.config.ExceptionConfig;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;
@Slf4j
@AllArgsConstructor
@ControllerAdvice
public class HandlerException {

    private final ExceptionConfig exceptionConfig;
    @ExceptionHandler(MyHandlerException.class)
    public ResponseEntity<Object> myHandlerException(MyHandlerException myHandlerException){
        log.error("{} {}",exceptionConfig.getExceptionMessage(ExceptionConfig.BUSSINES), myHandlerException.getMessage());
        return ResponseEntity.badRequest().body(myHandlerException.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handlerException(Exception e){
        log.error("{} {}",exceptionConfig.getExceptionMessage(ExceptionConfig.SYSTEM), e.getMessage());
        return ResponseEntity.status(
                HttpStatus.INTERNAL_SERVER_ERROR
        )
                .body(e.getMessage());
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity handleValidationException(MethodArgumentNotValidException ex){

        List<String> errors=new ArrayList<>();
        for(FieldError error : ex.getBindingResult().getFieldErrors()){
            //errors.add(error.getObjectName()+" field: "+error.getField()+" Error: "+error.getDefaultMessage());
            errors.add("""
                    %s field %s Error %s"""
                    .formatted(error.getObjectName(),error.getField(),error.getDefaultMessage()));
        }
        log.error("{} Error info : \n {}",exceptionConfig.getExceptionMessage(ExceptionConfig.SYSTEM)  , errors);
        return ResponseEntity.badRequest().body(errors);
    }

}
