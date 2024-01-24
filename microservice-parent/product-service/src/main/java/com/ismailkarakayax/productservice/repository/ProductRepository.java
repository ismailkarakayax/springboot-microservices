package com.ismailkarakayax.productservice.repository;

import com.ismailkarakayax.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
