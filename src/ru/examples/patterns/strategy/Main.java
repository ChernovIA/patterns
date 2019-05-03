package ru.examples.patterns.strategy;

import ru.examples.patterns.strategy.payStrategyImp.PayByCreditCard;
import ru.examples.patterns.strategy.payStrategyImp.PayByOnlineMoney;

public class Main {
    public static void main(String[] args) {
        PayByCreditCard  payByCreditCard  = new PayByCreditCard();
        PayByOnlineMoney payByOnlineMoney = new PayByOnlineMoney();

        Order order1 = new Order(payByCreditCard);
        Order order2 = new Order(payByOnlineMoney);

        order1.payOrder();
        order2.payOrder();
    }
}
