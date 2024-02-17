package com.aula.products.product.service.impl;

import com.aula.products.product.dto.ProductDto;
import com.aula.products.product.exception.MyHandlerException;
import com.aula.products.product.model.ProductEntity;
import com.aula.products.product.repository.ProductRepository;
import com.aula.products.product.service.IProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements IProductService {
    private final ProductRepository productRepo;

    @Override
    public ResponseEntity save(ProductDto productDto) {

        var productExist =this.productRepo.findByName(productDto.getName());
        if(productExist.isPresent()){
            throw new MyHandlerException("the product name: "+productDto.getName()+" already exists ");
        }
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
        if(!productEntityOptional.isPresent()){
            throw new MyHandlerException("The product "+productDto.getName()+" does't exist");
        }
        ProductEntity productEntity=productEntityOptional.get();

        productEntity.setName(productDto.getName());
        productEntity.setDescription(productDto.getDescription());
        productEntity.setStock(productDto.getStock());
        productEntity.setPrice(productDto.getPrice());
        productEntity.setCreatedAt(LocalDateTime.now());

        var updatedProductEntity=this.productRepo.save(productEntity);

        return ResponseEntity.status(HttpStatus.OK).body("Updated");

    }

    @Override
    public ResponseEntity findByName(String name) {
        //ProductEntity productEntity=this.productRepo.findByName(name).orElse((new ProductEntity()));
        //return ResponseEntity.ok(productEntity);
        return this.productRepo
                .findByName(name)
                .map(ResponseEntity::ok)
                .orElseThrow(()->new MyHandlerException(("product with name "+name+" does't exist")));
    }

    @Override
    public ResponseEntity findByNameAndStockGreaterThan(String name) {
        return this.productRepo
                .findByNameAndStockGreaterThan(name,1)
                .map(ResponseEntity::ok)
                .orElseGet(()->ResponseEntity.notFound().build());
    }
}
