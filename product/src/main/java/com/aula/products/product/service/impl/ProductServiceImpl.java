package com.aula.products.product.service.impl;

import com.aula.products.product.dto.ProductDto;
import com.aula.products.product.model.ProductEntity;
import com.aula.products.product.repository.ProductRepository;
import com.aula.products.product.service.IProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements IProductService {
    private final ProductRepository productRepo;

    @Override
    public ResponseEntity save(ProductDto productDto) {
        ProductEntity productEntity=new ProductEntity();
        productEntity.setName(productDto.getName());
        productEntity.setDescription(productDto.getDescription());
        productEntity.setStock(productDto.getStock());
        productEntity.setPrice(productDto.getPrice());
        productEntity.setCreatedAt(LocalDateTime.now());

        var newProd=this.productRepo.save(productEntity);

        return ResponseEntity.status(HttpStatus.CREATED).body(newProd);
    }

    @Override
    public ResponseEntity getAll() {

        var lisrtUser=this.productRepo.findAll();
        return ResponseEntity.ok(lisrtUser);
    }

    @Override
    public ResponseEntity deleteById(long id) {

        this.productRepo.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Product deleted");
    }

    @Override
    public ResponseEntity update(ProductDto productDto, long id) {
        Optional<ProductEntity> productEntityOptional=this.productRepo.findById(id);
        if(productEntityOptional.isPresent()){
            ProductEntity productEntity=productEntityOptional.get();

            productEntity.setName(productDto.getName());
            productEntity.setDescription(productDto.getDescription());
            productEntity.setStock(productDto.getStock());
            productEntity.setPrice(productDto.getPrice());
            productEntity.setCreatedAt(LocalDateTime.now());

            var updatedProductEntity=this.productRepo.save(productEntity);

            return ResponseEntity.status(HttpStatus.OK).body("Updated");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not found");
    }
}
