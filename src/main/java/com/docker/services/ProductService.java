package com.docker.services;

import com.docker.domain.Product;

public interface ProductService {


        Iterable<Product> listAllProducts();

        Product getProductById(Integer id);

        Product saveProduct(Product product);
    }
