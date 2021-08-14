package com.dio.cloud.productcatalog.repository;

import com.dio.cloud.productcatalog.model.*;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
