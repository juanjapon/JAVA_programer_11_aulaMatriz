package com.aula.products.product.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Builder
@Data
@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
    @Id
    @GeneratedValue()
    private long id;
    private String name;
    private String description;
    private long price;
    private long stock;
    @Column(name="created_at")
    private LocalDateTime createdAt;



}
