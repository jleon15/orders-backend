package com.basis.theory.pairing.services;

import com.basis.theory.pairing.models.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OrdersService implements IOrdersService {

    @Override
    public List<PizzaOrder> getPizzaOrders() {
        // TODO get from database
        return new ArrayList<>(Arrays.asList(generatePizza(), generatePizza(), generatePizza()));
    }

    private PizzaOrder generatePizza() {
        Random random = new Random();

        return new PizzaOrder(
                random.nextInt(Integer.MAX_VALUE),
                new Pizza(random.nextInt(), "Cheese", Collections.singletonList(new PizzaTopping(random.nextInt(), "More Cheese"))),
                new PizzaCrust(random.nextInt(), "Stuffed crust"),
                new PizzaSize(random.nextInt(), "Huge")
        );
    }
}
