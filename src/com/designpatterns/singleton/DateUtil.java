package com.designpatterns.singleton;

/*
* DateUtil singleton with lazy initialization
* Private constructor, private static instance variable, public getInstance method
* Private constructor as no one can initialize this class
* Lazy initialization - only initializes whenever getInstance gets called
* Only happens once. Same initialized instance will be available to every time whenever it gets called.
* Example - PropertyReader, DatabaseConnectionSetup, Loggers
* */
public class DateUtil {

    private static DateUtil instance;
    private DateUtil() {
    }

    public static DateUtil getInstance() {
        if(instance == null)
            instance = new DateUtil();
        return instance;
    }
}
