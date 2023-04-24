package com.designpatterns.adapter;

public class PaymentAdapter {

    public int pay(int rupees) {
        int dollars = rupees * 80;
        PaymentProcessor paymentProcessor = new PaymentProcessorImpl();
        int inr = paymentProcessor.pay(dollars);

        return inr;
    }
}
