package com.kharidlo.kharidlo.service;

import com.kharidlo.kharidlo.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product(1,"MacBook Air M1",60000),new Product(2,"MacBook Air M2",80000), new Product(3,"MacBook Air M3",114000));

    public List<Product> getProduct(){
        return products;
    }

}
