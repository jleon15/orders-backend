package com.basis.theory.pairing.models.responses;

import com.basis.theory.pairing.models.PizzaOrder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter @NoArgsConstructor
public class PizzaOrderPage {

    private List<PizzaOrder> orders;
    private int totalPages;
    private long totalItems;
    private int pageNumber;
    private boolean isFirstPage;
    private boolean isLastPage;

    public PizzaOrderPage(List<PizzaOrder> orders, int totalPages, long totalItems, int pageNumber, boolean isFirstPage, boolean isLastPage) {
        this.orders = orders;
        this.totalPages = totalPages;
        this.totalItems = totalItems;
        this.pageNumber = pageNumber;
        this.isFirstPage = isFirstPage;
        this.isLastPage = isLastPage;
    }
}
