package com.basis.theory.pairing.controllers;

import com.basis.theory.pairing.models.PizzaOrder;
import com.basis.theory.pairing.services.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "api")
public class OrdersController {

    @Autowired
    private IOrdersService ordersService;

    @GetMapping(path = "/orders")
    public ResponseEntity<List<PizzaOrder>> getOrders() {
        return ResponseEntity.ok(this.ordersService.getPizzaOrders());
    }

}
