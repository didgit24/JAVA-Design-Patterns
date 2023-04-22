package com.designpatterns.abstractFactory;

public class XMLEmpDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saving Employee to XML");
    }
}
