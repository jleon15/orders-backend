package com.basis.theory.pairing.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pizza_crusts", schema = "orders")
@Getter
@Setter
@NoArgsConstructor
public class PizzaCrust {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    public com.basis.theory.pairing.models.PizzaCrust toModel() {
        return new com.basis.theory.pairing.models.PizzaCrust(
                this.id,
                this.name
        );
    }
}
