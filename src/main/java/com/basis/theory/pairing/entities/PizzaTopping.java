package com.basis.theory.pairing.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pizza_toppings", schema = "orders")
@Getter
@Setter
@NoArgsConstructor
public class PizzaTopping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private Pizza pizza;

    com.basis.theory.pairing.models.PizzaTopping toModel() {
        return new com.basis.theory.pairing.models.PizzaTopping(
                this.id,
                this.name
        );
    }
}
