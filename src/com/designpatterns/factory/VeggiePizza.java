package com.designpatterns.factory;

public class VeggiePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Veg Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake Veg Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut Veg Pizza");
    }
}
