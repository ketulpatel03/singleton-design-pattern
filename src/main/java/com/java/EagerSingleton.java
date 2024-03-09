package com.java;

public class EagerSingleton {

    // private constructor
    private EagerSingleton() {
    }

    // static instance (initialized)
    private static EagerSingleton instance = new EagerSingleton();

    // public static getInstance() method
    public static EagerSingleton getInstance() {
        return instance;
    }

}
