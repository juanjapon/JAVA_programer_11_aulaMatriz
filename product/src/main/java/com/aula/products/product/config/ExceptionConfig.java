package com.aula.products.product.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;
@Data
@Component
@ConfigurationProperties(prefix="handle")
public class ExceptionConfig {
    private Map<String,String> exception;

    public static final String BUSSINES="bussines";
    public static final String SYSTEM="system";

    public String getExceptionMessage(final String exceptionType){
        return exception.get(exceptionType);
    }
}
