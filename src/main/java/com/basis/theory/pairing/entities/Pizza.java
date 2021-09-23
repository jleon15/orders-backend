package com.basis.theory.pairing.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Table(name = "pizzas", schema = "orders")
@Getter
@Setter
@NoArgsConstructor
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @OneToMany(mappedBy = "pizza", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<PizzaTopping> toppings;

    public com.basis.theory.pairing.models.Pizza toModel() {
        return new com.basis.theory.pairing.models.Pizza(
                this.id,
                this.name,
                this.toppings.stream().map(PizzaTopping::toModel
                ).collect(Collectors.toList())
        );
    }
}
