package com.xworkz.Rcbweb.controller;

import com.xworkz.Rcbweb.Service.ProductService;
import com.xworkz.Rcbweb.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ProductController {
    @Autowired( required = true)
    ProductService productService;
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
    @GetMapping("/getProduct/{productId}")

    public Optional<Product> getProductById(@PathVariable int productId){
        return productService.getProductById(productId);
    }
}
