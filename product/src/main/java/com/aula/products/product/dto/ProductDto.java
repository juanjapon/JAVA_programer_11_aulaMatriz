package com.aula.products.product.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDto{

    private String name;
    private String description;
    private long price;
    private int stock;


}