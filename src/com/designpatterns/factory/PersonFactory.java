package com.designpatterns.factory;

public class PersonFactory {

    public static Person chooseWish(String msg) {
        Person person = null;

        if(msg.equals("Male"))
            person = new Male();
        else if (msg.equals("Female"))
            person = new Female();

        person.wish(msg);

        return person;
    }
}
