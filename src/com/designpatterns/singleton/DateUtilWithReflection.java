package com.designpatterns.singleton;

import java.io.Serializable;

/*
 constructors.setAccessible(true); created new instance fro reflection api
* */
public class DateUtilWithReflection implements Serializable, Cloneable {

    private static volatile DateUtilWithReflection instance;
    private DateUtilWithReflection() {
    }

    public static DateUtilWithReflection getInstance() {
        if (instance == null) {
            synchronized (DateUtilWithReflection.class) {
                if (instance == null)
                    instance = new DateUtilWithReflection();
            }
        }
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
