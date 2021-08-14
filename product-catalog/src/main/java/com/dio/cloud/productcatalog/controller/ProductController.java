package com.dio.cloud.productcatalog.controller;

import com.dio.cloud.productcatalog.model.*;
import com.dio.cloud.productcatalog.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product){
        return productRepository.save(product);

    }

    @RequestMapping(value = ";{id}", method = RequestMethod.GET)
    Optional<Product> findById(@PathVariable Integer Id){
        return productRepository.findById(Id);
    }
}
