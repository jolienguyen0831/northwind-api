package com.pluralsight.northwind_api.repository;

import com.pluralsight.northwind_api.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findByCustomerID(int customerID);
    List<Order> findByEmployeeID(int employeeID);

}
