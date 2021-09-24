package com.basis.theory.pairing.controllers;

import com.basis.theory.pairing.models.responses.PizzaOrderPage;
import com.basis.theory.pairing.services.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path = "api")
public class OrdersController {

    @Autowired
    private IOrdersService ordersService;

    @GetMapping(path = "/orders")
    public ResponseEntity<PizzaOrderPage> getOrders(
            @RequestParam Optional<Integer> pageNumber,
            @RequestParam Optional<Integer> pageSize
    ) {
        int number = pageNumber.orElse(0);
        int size = pageSize.orElse(5);

        return ResponseEntity.ok(
                this.ordersService.getPizzaOrders(PageRequest.of(number, size))
        );
    }

}
