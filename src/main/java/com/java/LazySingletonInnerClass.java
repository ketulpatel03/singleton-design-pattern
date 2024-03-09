package com.java;

public class LazySingletonInnerClass {

    private LazySingletonInnerClass() {
    }

    private static class SingletonHelper {
        private static final LazySingletonInnerClass instance = new LazySingletonInnerClass();
    }

    public static LazySingletonInnerClass getInstance() {
        return SingletonHelper.instance;
    }
}
