package com.example.demo.client;

import com.example.demo.entity.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange(url = "/products")
public interface ProductClient {

    @GetExchange("/{productId}")
    Product getProduct(@PathVariable Integer productId);

    @GetExchange
    List<Product> getProducts();
}
