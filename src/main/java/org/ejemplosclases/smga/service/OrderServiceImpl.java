package org.ejemplosclases.smga.service;

import jakarta.transaction.Transactional;
import org.ejemplosclases.smga.model.Order;
import org.ejemplosclases.smga.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Transactional
    public void updateOrder(Order order) {
        orderRepository.save(order);
    }
}

