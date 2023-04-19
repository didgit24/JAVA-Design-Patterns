package com.designpatterns.factory;

public class Female implements Person{
    @Override
    public void wish(String msg) {
        System.out.println("Hi, I am " + msg + "!");
    }
}
