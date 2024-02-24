package com.aula.products.product.controller.doc;

import com.aula.products.product.dto.ProductDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name="Product",description="API exposed for CRUD products")
@RequestMapping("/api/v1/product")
public interface ProductDoc {
    @Operation(
            summary = "POST create",
            description = "This operation is fo create a new product"
    )
    @ApiResponses(
            value = {
                    @ApiResponse (
                            responseCode = "201",
                            description = "product created",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
                    ),
                    @ApiResponse (
                            responseCode = "404",
                            description = "not found",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
                    ),
                    @ApiResponse (
                            responseCode = "500",
                            description = "internal server Error",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
                    )
            }
    )
    @PostMapping
    ResponseEntity createProduct(@Valid @RequestBody ProductDto productDto);
    @Operation(
            summary = "Get list product",
            description = "This operation is for getting all products form dafity"
    )
    @ApiResponses(
            value = {
                    @ApiResponse (
                            responseCode = "201",
                            description = "list all products",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
                    ),
                    @ApiResponse (
                            responseCode = "404",
                            description = "not found",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
                    ),
                    @ApiResponse (
                            responseCode = "500",
                            description = "internal server Error",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
                    )
            }
    )
    @GetMapping
    ResponseEntity<?> getAll();
    @Operation(
            summary = "Delete product",
            description = "This operation is for deleting a product"
    )
    @ApiResponses(
            value = {
                    @ApiResponse (
                            responseCode = "201",
                            description = "Product deleted",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
                    ),
                    @ApiResponse (
                            responseCode = "404",
                            description = "not found",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
                    ),
                    @ApiResponse (
                            responseCode = "500",
                            description = "internal server Error",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
                    )
            }
    )
    @DeleteMapping("/{id}")
    ResponseEntity<?> deleteById(@PathVariable long id);
    @Operation(
            summary = "Update product",
            description = "This operation is for updating a product"
    )
    @ApiResponses(
            value = {
                    @ApiResponse (
                            responseCode = "201",
                            description = "Product updated",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
                    ),
                    @ApiResponse (
                            responseCode = "404",
                            description = "not found",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
                    ),
                    @ApiResponse (
                            responseCode = "500",
                            description = "internal server Error",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
                    )
            }
    )
    @PutMapping("/{id}")
    ResponseEntity<?> update(@RequestBody ProductDto productDto,@PathVariable long id);

    @Operation(
            summary = "get by name product",
            description = "This operation is for getting a product by name"
    )
    @ApiResponses(
            value = {
                    @ApiResponse (
                            responseCode = "201",
                            description = "get product",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
                    ),
                    @ApiResponse (
                            responseCode = "404",
                            description = "not found",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
                    ),
                    @ApiResponse (
                            responseCode = "500",
                            description = "internal server Error",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
                    )
            }
    )
    @GetMapping("/name")
    ResponseEntity<?> findByName(@RequestParam String name);
    @Operation(
            summary = "get by name and with stock",
            description = "This operation is for getting a product by name if it has stock"
    )
    @ApiResponses(
            value = {
                    @ApiResponse (
                            responseCode = "201",
                            description = "get product with stock",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
                    ),
                    @ApiResponse (
                            responseCode = "404",
                            description = "not found",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
                    ),
                    @ApiResponse (
                            responseCode = "500",
                            description = "internal server Error",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
                    )
            }
    )
    @GetMapping("/nameAndStock")
    ResponseEntity<?> findByNameAndStockGreaterThan(@RequestParam String name);
}
