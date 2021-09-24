package com.basis.theory.pairing.services;

import com.basis.theory.pairing.models.responses.PizzaOrderPage;
import org.springframework.data.domain.Pageable;

public interface IOrdersService {

    PizzaOrderPage getPizzaOrders(Pageable pageable);

}
