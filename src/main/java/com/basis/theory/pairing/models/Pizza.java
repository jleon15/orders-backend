package com.basis.theory.pairing.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter @NoArgsConstructor
public class Pizza {

    private Integer id;
    private String name;
    private List<PizzaTopping> toppings;

    public Pizza(Integer id, String name, List<PizzaTopping> toppings) {
        this.id = id;
        this.name = name;
        this.toppings = toppings;
    }
}
