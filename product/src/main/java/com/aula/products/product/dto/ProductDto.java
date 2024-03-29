package com.aula.products.product.dto;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDto extends TraceUUIDDTO{

    @NotNull
    @Size(min=3,message = "El nombre debe tener al menos 3 caracteres")
    private String name;
    @NotNull
    @Size(min=4)
    private String description;
    @NotNull
    @DecimalMin(value="10.0")
    private long price;
    @NotNull
    @Min(value=0,message = "El stock no puede ser negativo")
    private int stock;


}