package com.example.fakestoreapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.fakestoreapi.external.FakeStore;
import com.example.fakestoreapi.model.dto.Product;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class FakeStoreController {

    private final FakeStore fakeStore;

    @GetMapping
    public List<Product> getAllProducts() {
        return fakeStore.getAllProducts();
    }
}
