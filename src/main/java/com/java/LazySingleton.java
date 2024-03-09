package com.java;

public class LazySingleton {

    // private constructor
    private LazySingleton() {
    }

    // static instance (don't initialize)
    private static LazySingleton instance;

    // public static getInstance() method with null check
    public static LazySingleton getInstance() {
        if (instance == null) {
            return instance = new LazySingleton();
        } else {
            return instance;
        }
    }

}
