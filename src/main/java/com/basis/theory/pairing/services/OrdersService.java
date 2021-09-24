package com.basis.theory.pairing.services;

import com.basis.theory.pairing.models.*;
import com.basis.theory.pairing.models.responses.PizzaOrderPage;
import com.basis.theory.pairing.repositories.PizzaOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public PizzaOrderPage getPizzaOrders(Pageable pageable) {
        Page<com.basis.theory.pairing.entities.PizzaOrder> pageItems = this.orderRepository.findAll(pageable);
        List<PizzaOrder> orders = pageItems.stream().map(order ->
                order.toModel()
        ).collect(Collectors.toList());

        return new PizzaOrderPage(
                orders,
                pageItems.getTotalPages(),
                pageItems.getTotalElements(),
                pageItems.getNumber(),
                pageItems.isFirst(),
                pageItems.isLast()
        );
    }
}
