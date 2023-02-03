package com.xworkz.Rcbweb.repository;

import com.xworkz.Rcbweb.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{
    @Query("SELECT p from Product p where p.productName= ?1")
    Product findByName(@Param("productName") String productName );

}
