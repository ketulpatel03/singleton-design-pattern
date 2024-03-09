package com.java;

public class LazySingletonThreadSafe {

    // private constructor
    private LazySingletonThreadSafe() {
    }

    // static instance (don't initialize)
    private static LazySingletonThreadSafe instance;

    // public static getInstance() method with null check and synchronized block(with null check)
    public static LazySingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (LazySingletonThreadSafe.class) {
                if (instance == null) {
                    return instance = new LazySingletonThreadSafe();
                }
            }
        }
        return instance;
    }

}
