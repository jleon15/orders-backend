package com.basis.theory.pairing.repositories;

import com.basis.theory.pairing.entities.PizzaOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaOrderRepository extends JpaRepository<PizzaOrder, Integer> {

}
