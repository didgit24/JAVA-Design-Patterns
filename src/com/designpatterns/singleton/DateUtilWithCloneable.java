package com.designpatterns.singleton;

import java.io.Serializable;

/*
Implement cloneable method to stop cloning
throw new CloneNotSupportedException()
* */
public class DateUtilWithCloneable implements Serializable, Cloneable {

    private static volatile DateUtilWithCloneable instance;
    private DateUtilWithCloneable() {
    }

    public static DateUtilWithCloneable getInstance() {
        if (instance == null) {
            synchronized (DateUtilWithCloneable.class) {
                if (instance == null)
                    instance = new DateUtilWithCloneable();
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
