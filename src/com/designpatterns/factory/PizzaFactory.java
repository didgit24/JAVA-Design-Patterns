package com.designpatterns.factory;

/*
* Object creation logic depends on factory class
* */
public class PizzaFactory {

    public static Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type.equals("Cheese"))
            pizza = new CheesePizza();
        else if (type.equals("Chicken"))
            pizza = new ChickenPizza();
        else if (type.equals("Veg"))
            pizza = new VeggiePizza();

        return pizza;
    }
}
