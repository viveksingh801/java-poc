package com.influido.poc.controller;

import com.influido.poc.domains.Product;

public class ProductCO {

    private Long id;

    private String name;

    private Double price;

    private Long quantityLeft;

    private Float rating;

    private Boolean isDeleted;

    public Long getId() {
        return id;
    }

    public ProductCO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductCO setName(String name) {
        this.name = name;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public ProductCO setPrice(Double price) {
        this.price = price;
        return this;
    }

    public Long getQuantityLeft() {
        return quantityLeft;
    }

    public ProductCO setQuantityLeft(Long quantityLeft) {
        this.quantityLeft = quantityLeft;
        return this;
    }

    public Float getRating() {
        return rating;
    }

    public ProductCO setRating(Float rating) {
        this.rating = rating;
        return this;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public ProductCO setDeleted(Boolean deleted) {
        isDeleted = deleted;
        return this;
    }

    public static Product toDomain(ProductCO productCO) {
        return new Product()
                .setDeleted(productCO.isDeleted)
                .setName(productCO.name)
                .setPrice(productCO.price)
                .setQuantityLeft(productCO.quantityLeft)
                .setRating(productCO.rating);
    }
}
