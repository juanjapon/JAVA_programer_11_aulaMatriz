package com.aula.products.product.mapper;

import com.aula.products.product.dto.ProductDto;
import com.aula.products.product.model.ProductEntity;

import java.time.LocalDateTime;

public class ProductMapper {
    public static ProductEntity maptoEntity(ProductDto productDto){
        /**
        ProductEntity productEntity=new ProductEntity();
        productEntity.setName(productDto.getName());
        productEntity.setDescription(productDto.getDescription());
        productEntity.setStock(productDto.getStock());
        productEntity.setPrice(productDto.getPrice());
        productEntity.setCreatedAt(LocalDateTime.now());
        **/
        return ProductEntity.builder()
                .name(productDto.getName())
                .description(productDto.getDescription())
                .price(productDto.getPrice())
                .stock(productDto.getStock())
                .createdAt(LocalDateTime.now())
                .build();
    }
}
