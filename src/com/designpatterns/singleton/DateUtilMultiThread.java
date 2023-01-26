package com.designpatterns.singleton;

/*
* It will fail if two threads checks if condition at a same time and creates two instance.
* To avoid we can use syncronized block
* Lock object or class
*
* Acquiring lock is an expensive process
* We will check if instance is null, then only we will acquire the lock
* Double check
* make static variable volatile to avoid issue in multi thread
* (Volatile keyword is used to modify the value of a variable by different threads. It is also used to make classes thread safe. It means that multiple threads can use a method and instance of the classes at the same time without any problem. The volatile keyword can be used either with primitive type or objects.)
* */
public class DateUtilMultiThread {

    private static volatile DateUtilMultiThread instance;
    private DateUtilMultiThread() {
    }

    public static DateUtilMultiThread getInstance() {
        if (instance == null) {
            synchronized (DateUtilMultiThread.class) {
                if (instance == null)
                    instance = new DateUtilMultiThread();
            }
        }
        return instance;
    }
}
