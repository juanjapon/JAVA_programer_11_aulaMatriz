package com.aula.products.product.controller;

import com.aula.products.product.controller.doc.ProductDoc;
import com.aula.products.product.dto.ProductDto;
import com.aula.products.product.service.IProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class ProductController implements ProductDoc {

    private final IProductService iProductService;
    @Override
    public ResponseEntity createProduct( ProductDto productDto) {
        return this.iProductService.save(productDto);
    }

    @Override
    public ResponseEntity<?> getAll() {
        return this.iProductService.getAll();
    }



    @Override
    public ResponseEntity deleteById(@PathVariable long id) {
        return this.iProductService.deleteById(id);
    }

    @Override
    public ResponseEntity<?> update(ProductDto productDto, long id) {
        return this.iProductService.update(productDto,id);
    }
}