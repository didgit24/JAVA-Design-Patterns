package com.designpatterns.factory;

/**
 * PizzaStore takes the type and pass to factory class to create the object
 */
public class PizzaStore {

    public Pizza orderPizza(String type) {
      //  Pizza pizza = null;

//        if(type.equals("Cheese"))
//            pizza = new CheesePizza();
//        else if (type.equals("Chicken"))
//            pizza = new ChickenPizza();
//        else if (type.equals("Veg"))
//            pizza = new VeggiePizza();

        Pizza pizza = PizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();

        return pizza;
    }
}
