package ru.examples.patterns.strategy;

import ru.examples.patterns.strategy.behavies.PayStrategy;

public class Order {

    private PayStrategy payStrategy;

    public Order(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void payOrder() {
        payStrategy.pay();
    }

}
