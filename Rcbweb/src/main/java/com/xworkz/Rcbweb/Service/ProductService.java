package com.xworkz.Rcbweb.Service;

import com.xworkz.Rcbweb.model.Product;
import com.xworkz.Rcbweb.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired( required = true)
    ProductRepository productRepository;
    private final Logger log = LoggerFactory.getLogger(ProductService.class);

    public Optional<Product> getProductById(int productId){
        return productRepository.findById(productId);
    }
}
