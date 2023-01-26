package com.designpatterns.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DateUtilTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //Singleton test
        DateUtil dateUtil1 = DateUtil.getInstance();
        DateUtil dateUtil2 = DateUtil.getInstance();

        System.out.println(dateUtil1 == dateUtil2);

        //Serialization test
        DateUtilWithSerialization dateUtilWithSerialization1 = DateUtilWithSerialization.getInstance();
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\002U6M744\\Desktop\\Courses and Learnings\\Udemy\\JAVA-Design-Patterns\\singleton\\dateUtil.ser")));
        stream.writeObject(dateUtilWithSerialization1);

        DateUtilWithSerialization dateUtilWithSerialization2 = null;
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\002U6M744\\Desktop\\Courses and Learnings\\Udemy\\JAVA-Design-Patterns\\singleton\\dateUtil.ser")));
        dateUtilWithSerialization2 = (DateUtilWithSerialization) inputStream.readObject();

        stream.close();
        inputStream.close();

        System.out.println(dateUtilWithSerialization1 == dateUtilWithSerialization2);

        //Reflection break test
        DateUtilWithReflection dateUtilWithReflection1 = DateUtilWithReflection.getInstance();
        DateUtilWithReflection dateUtilWithReflection2 = null;

        Constructor<DateUtilWithReflection> constructors = DateUtilWithReflection.class.getDeclaredConstructor();
        constructors.setAccessible(true);
        dateUtilWithReflection2 = constructors.newInstance();
        System.out.println(dateUtilWithReflection1.hashCode() == dateUtilWithReflection2.hashCode());

        //Reflection solution test
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        System.out.println(enumSingleton.getName());
        enumSingleton.setName("Indranil");
        System.out.println(enumSingleton.getName());

    }
}
