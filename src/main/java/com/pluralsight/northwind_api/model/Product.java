package com.pluralsight.northwind_api.model;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;

@Entity
@Table(name = "Products")
@JsonPropertyOrder({"productID", "productName", "categoryID", "category"})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductID")
    private int productID;

    @Column(name = "ProductName")
    private String productName;

    @Column(name = "SupplierID")
    private Integer supplierID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CategoryID", insertable = false, updatable = false)
    private Category category;


    @Column(name = "CategoryID")
    private Integer categoryID;



    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(Integer supplierID) {
        this.supplierID = supplierID;
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

