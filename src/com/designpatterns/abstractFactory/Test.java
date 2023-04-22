package com.designpatterns.abstractFactory;

public class Test {
    public static void main(String[] args) {
        DaoAbstractFactory daoAbstractFactory = DaoFactoryProducer.produce("xml");
        Dao dao = daoAbstractFactory.createDao("emp");
        dao.save();
    }
}
