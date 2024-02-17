package com.aula.products.product.repository;

import com.aula.products.product.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {

    Optional<ProductEntity> findByName(String name);
    Optional<ProductEntity> findByNameAndStockGreaterThan(String name,int num);
}
