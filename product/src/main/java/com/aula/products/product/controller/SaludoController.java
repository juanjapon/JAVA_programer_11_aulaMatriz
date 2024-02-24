package com.aula.products.product.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class SaludoController {

    @Value("${saludo.aulamatriz}")
    private String saludo;
    @GetMapping()
    public ResponseEntity saludar(){
        return ResponseEntity.ok(saludo);
    }
}
