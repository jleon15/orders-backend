package com.basis.theory.pairing.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pizza_orders", schema = "orders")
@Getter
@Setter
@NoArgsConstructor
public class PizzaOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pizza_id", referencedColumnName = "id")
    private Pizza pizza;

    @OneToOne
    @JoinColumn(name = "crust_id", referencedColumnName = "id")
    private PizzaCrust pizzaCrust;

    @OneToOne
    @JoinColumn(name = "size_id", referencedColumnName = "id")
    private PizzaSize pizzaSize;

}
