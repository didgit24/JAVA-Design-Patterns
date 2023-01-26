package com.designpatterns.singleton;

import java.io.Serializable;

public class LoggerSingleton implements Serializable, Cloneable {

    private static volatile LoggerSingleton instance;
    private LoggerSingleton() {
    }

    public static LoggerSingleton getInstance() {
        if (instance == null) {
            synchronized (LoggerSingleton.class) {
                if (instance == null)
                    instance = new LoggerSingleton();
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
