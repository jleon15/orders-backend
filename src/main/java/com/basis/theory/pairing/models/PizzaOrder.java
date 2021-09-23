package com.basis.theory.pairing.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PizzaOrder {

    private Integer id;
    private Pizza pizza;
    private PizzaCrust crust;
    private PizzaSize size;

    public PizzaOrder(Integer id, Pizza pizza, PizzaCrust crust, PizzaSize size) {
        this.id = id;
        this.pizza = pizza;
        this.crust = crust;
        this.size = size;
    }
}
