package com.designpatterns.factory;

public class Male implements Person{
    @Override
    public void wish(String msg) {
        System.out.println("Hi, I am " + msg + "!");
    }
}
