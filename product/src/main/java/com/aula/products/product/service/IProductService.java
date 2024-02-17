package com.aula.products.product.service;

import com.aula.products.product.dto.ProductDto;
import org.springframework.http.ResponseEntity;

public interface IProductService {
    ResponseEntity save(ProductDto productDto);
    ResponseEntity getAll();

    ResponseEntity deleteById(long id);

    ResponseEntity update(ProductDto productDto,long id);
}
