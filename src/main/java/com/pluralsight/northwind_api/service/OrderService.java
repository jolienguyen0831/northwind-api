package com.pluralsight.northwind_api.service;

import com.pluralsight.northwind_api.model.Order;
import com.pluralsight.northwind_api.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(int id) {
        return orderRepository.findById(id);
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public boolean deleteOrder(int id) {
        if (!orderRepository.existsById(id)) {
            return false;
        }
        orderRepository.deleteById(id);
        return true;
    }

    public List<Order> getOrdersByCustomerID(int customerID) {
        return orderRepository.findByCustomerID(customerID);
    }

    public List<Order> getOrdersByEmployeeID(int employeeID) {
        return orderRepository.findByEmployeeID(employeeID);
    }
    public Optional<Order> updateOrder(int id, Order order) {
        if (!orderRepository.existsById(id)) {
            return Optional.empty();
        }
        order.setOrderID(id);
        return Optional.of(orderRepository.save(order));
    }
}
