package com.aula.products.product.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandlerException {
    @ExceptionHandler(MyHandlerException.class)
    public ResponseEntity<Object> myHandlerException(MyHandlerException myHandlerException){

        return ResponseEntity.badRequest().body(myHandlerException.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handlerException(Exception e){
        return ResponseEntity.status(
                HttpStatus.INTERNAL_SERVER_ERROR
        )
                .body(e.getMessage());
    }

}
