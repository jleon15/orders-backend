package com.basis.theory.pairing.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pizza_sizes", schema = "orders")
@Getter
@Setter
@NoArgsConstructor
public class PizzaSize {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String size;

    public com.basis.theory.pairing.models.PizzaSize toModel() {
        return new com.basis.theory.pairing.models.PizzaSize(
                this.id,
                this.size
        );
    }
}
