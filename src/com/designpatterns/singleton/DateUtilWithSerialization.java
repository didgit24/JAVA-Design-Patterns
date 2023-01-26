package com.designpatterns.singleton;

import java.io.Serializable;

/*
If we serialize and deserialize the same instance it will give different values for Singleton classes.

* */
public class DateUtilWithSerialization implements Serializable {

    private static volatile DateUtilWithSerialization instance;
    private DateUtilWithSerialization() {
    }

    public static DateUtilWithSerialization getInstance() {
        if (instance == null) {
            synchronized (DateUtilWithSerialization.class) {
                if (instance == null)
                    instance = new DateUtilWithSerialization();
            }
        }
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }
}
