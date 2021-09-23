package com.basis.theory.pairing.services;

import com.basis.theory.pairing.models.*;
import com.basis.theory.pairing.repositories.PizzaOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class OrdersService implements IOrdersService {

    @Autowired
    private PizzaOrderRepository orderRepository;

    @Transactional
    @Override
    public List<PizzaOrder> getPizzaOrders() {
        return this.orderRepository.findAll().stream().map(order ->
                new PizzaOrder(
                        order.getId(),
                        order.getPizza().toModel(),
                        order.getPizzaCrust().toModel(),
                        order.getPizzaSize().toModel()
                )
        ).collect(Collectors.toList());
    }
}
