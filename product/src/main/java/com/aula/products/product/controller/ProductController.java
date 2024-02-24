package com.aula.products.product.controller;

import com.aula.products.product.controller.doc.ProductDoc;
import com.aula.products.product.dto.ProductDto;
import com.aula.products.product.service.IProductService;
import com.aula.products.product.utilities.Utilities;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@Slf4j
@AllArgsConstructor
@RestController
public class ProductController implements ProductDoc {

    private final IProductService iProductService;
    @Override
    public ResponseEntity createProduct( ProductDto productDto) {
        productDto.setTrackingId(Utilities.generateUUID());
        log.info("creating product {} trackingId {} ",productDto,productDto.getTrackingId());
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

    @Override
    public ResponseEntity<?> findByName(String name) {
        return this.iProductService.findByName(name);
    }

    @Override
    public ResponseEntity<?> findByNameAndStockGreaterThan(String name) {
        return this.iProductService.findByNameAndStockGreaterThan(name);
    }
}
