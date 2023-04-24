package com.designpatterns.adapter;

public class PaymentProcessorImpl implements PaymentProcessor{
    @Override
    public int pay(int dollars) {
        return 80;
    }
}
