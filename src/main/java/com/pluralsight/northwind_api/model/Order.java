package com.pluralsight.northwind_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Orders")
public class Order {
    @Column( name ="CustomerID")
    private String customerID;
    @Column(name ="EmployeeID")
    private int employeeID;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="OrderID")
    private int orderID;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
}
