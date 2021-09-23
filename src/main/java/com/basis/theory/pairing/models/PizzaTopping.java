package com.basis.theory.pairing.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PizzaTopping {

    private Integer id;
    private String name;

    public PizzaTopping(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
