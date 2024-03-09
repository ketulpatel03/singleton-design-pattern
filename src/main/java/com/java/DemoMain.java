package com.java;

public class DemoMain {

    public static void main(String[] args) {

        /////////////////////////////////////////////////////////////////

        System.out.println("----- Eager Singleton -----");
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        System.out.println("object 1: " + eagerSingleton1.hashCode());

        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println("object 2: " + eagerSingleton2.hashCode());
        System.out.println("----- Eager Singleton -----\n");

        /////////////////////////////////////////////////////////////////

        System.out.println("----- Lazy Singleton -----");
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        System.out.println("object 1: " + lazySingleton1.hashCode());

        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println("object 2: " + lazySingleton2.hashCode());
        System.out.println("----- Lazy Singleton -----\n");

        /////////////////////////////////////////////////////////////////

        System.out.println("----- Lazy Singleton Thread safe -----");
        LazySingletonThreadSafe lazySingletonThreadSafe1 = LazySingletonThreadSafe.getInstance();
        System.out.println("object 1: " + lazySingletonThreadSafe1.hashCode());

        LazySingletonThreadSafe lazySingletonThreadSafe2 = LazySingletonThreadSafe.getInstance();
        System.out.println("object 2: " + lazySingletonThreadSafe2.hashCode());
        System.out.println("----- Lazy Singleton Thread safe -----\n");

        /////////////////////////////////////////////////////////////////

        System.out.println("----- Lazy Singleton Inner class -----");
        LazySingletonInnerClass lazySingletonInnerClass1 = LazySingletonInnerClass.getInstance();
        System.out.println("object 1: " + lazySingletonInnerClass1.hashCode());

        LazySingletonInnerClass lazySingletonInnerClass2 = LazySingletonInnerClass.getInstance();
        System.out.println("object 2: " + lazySingletonInnerClass2.hashCode());
        System.out.println("----- Lazy Singleton Inner class -----\n");

        /////////////////////////////////////////////////////////////////

    }


}
