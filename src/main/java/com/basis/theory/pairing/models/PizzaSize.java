package com.basis.theory.pairing.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PizzaSize {

    private Integer id;
    private String size;

    public PizzaSize(Integer id, String size) {
        this.id = id;
        this.size = size;
    }
}
