package com.designpatterns.adapter;

public class PaymentApp {

    public void pay(int rupees) {
        PaymentAdapter paymentApp = new PaymentAdapter();
        System.out.println(String.valueOf(paymentApp.pay(100)));
    }

    public static void main(String[] args) {
        PaymentApp paymentApp = new PaymentApp();
        paymentApp.pay(100);
    }
}
