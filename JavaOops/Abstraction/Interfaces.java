package Abstraction;

public class Interfaces {
//    abstract class can provide implementation of interfaces but interfaces cannot provide implementation of abstract
//    class
//    you cannot extend more than one class ,but you can implement more than one interface
//    you can extend one interface into another
//    all the annotations like @override are interfaces

//    nested interfaces can be declared public, private or protected
//    but top level interfaces can only be public or default

}

//interfaces contains all abstract methods, we cannot create object of interfaces so all the variables inside interfaces
//are static and final because we cannot access variables or initialize it
//classes implementing interfaces should override all the method present or declare abstract
//only default methods in interfaces can remain un-overridden

interface ParentDad{
//    static methods in interfaces should have body, if body not given this method will not get implement
//    static methods can be called by using interface.methodName
    static int sum(int a, int b){
        return a + b;
    }

//    all the instance methods are by default abstract
    int multi(int a, int b);

//    methods having extensions like static, default should have body
    default int divi(int a){
        return a / 2;
    }
}

interface ParentMom{

    int multi(int a, int b);

//    should not have in two interfaces which are being implemented by one single class
//    default int divi(int a){
//        return a / 2;
//    }
}

class child implements ParentMom , ParentDad{

//    as the abstract method does not have body this overridden method is newly defined so no ambiguity happens
//    access modifiers for overridden methods should be same or better

    @Override
    public int multi(int a, int b) {
        return 0;
    }

}