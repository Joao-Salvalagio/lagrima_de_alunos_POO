package com.joaosalvalagio.lagrimadealuno.services;
import com.joaosalvalagio.lagrimadealuno.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
}
