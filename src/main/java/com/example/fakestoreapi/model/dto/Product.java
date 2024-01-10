package com.example.fakestoreapi.model.dto;

import lombok.Data;

@Data
public class Product {

    private int id;

    private String title;

    private String price;

    private String category;

    private String description;

    private String image;
}
