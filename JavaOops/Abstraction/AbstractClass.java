package JavaRevision.JavaOops.Abstraction;

//if only one method inside the class is abstract you have to make the class abstract.
//abstract class can have abstract methods as well as normal methods
//abstract methods are methods without body  and these methods should be overridden by its child class otherwise
//child class and the method should be declared abstract



public class AbstractClass {

//    cannnot create object of abstract class
//    Parent obj = new Parent();
//    can use abstract class as reference
    Parent obj = new Child();
//    Child obj = new Child();

}

abstract class Parent{
    abstract int sum(int a, int b);

//    abstract class can have constructor but object of parent class cannot be created,
//but you cannot crate abstract constructor


    Parent(){
        System.out.println("Inside abstract constructor");
    }
    void printHello(){
        System.out.println("Hello world from abstract method");
    }

//    static methods cannot get overridden so what's the point to make it abstract
//    static abstract int multi(int a, int b);

}

class Child extends Parent{

//    the abstract method from parent class should be overridden or declare abstract
    @Override
    int sum(int a, int b) {
        return a + b;
    }
}