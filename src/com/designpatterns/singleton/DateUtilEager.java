package com.designpatterns.singleton;

/*
* DateUtil singleton with Eager initialization
* In this case class gets initialized before getInstance method called, so its named Eager
* Static block can also do this as its get loaded whenever memory gets loaded.
* */
public class DateUtilEager {

    //private static DateUtilEager instance = new DateUtilEager(); - one way of eager initialization
    private static DateUtilEager instance;

    //second way - using static block
    static {
        instance = new DateUtilEager();
    }

    private DateUtilEager() {
    }

    public static DateUtilEager getInstance() {
        return instance;
    }
}
