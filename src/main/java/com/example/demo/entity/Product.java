package com.example.demo.entity;

import java.util.List;

public record Product(
        Long id,
        String title,
        String description,
        Double price,
        Double discountPercentage,
        Double rating,
        Integer stock,
        String brand,
        String category,
        String thumbnail,
        List<String> images
) {
}
