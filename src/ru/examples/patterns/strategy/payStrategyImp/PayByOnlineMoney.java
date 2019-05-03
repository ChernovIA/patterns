package ru.examples.patterns.strategy.payStrategyImp;

import ru.examples.patterns.strategy.behavies.PayStrategy;

public class PayByOnlineMoney implements PayStrategy {
    @Override
    public void pay() {
        System.out.println("pay by online money");
    }
}
