package com.xworkz.Rcbweb.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "product_id")

    private Integer productId;
    @Column(name = "product_name",unique = true)
    private  String name;
    @Column(name = "Product_price")
    private Integer price;
    @Column(name = "product_desc")
    private String description;
    @Column(name = "product_quantity")
    private Integer quantity;
}
