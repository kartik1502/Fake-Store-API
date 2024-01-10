package com.example.fakestoreapi.external;

import com.example.fakestoreapi.model.dto.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "https://fakestoreapi.com", name = "fake-store-api")
public interface FakeStore {

    @GetMapping("/products")
    List<Product> getAllProducts();

}
