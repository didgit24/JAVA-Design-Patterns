package com.designpatterns.singleton;

/*
* No constructor so Reflection can't break
* */
public enum EnumSingleton {
    INSTANCE;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
