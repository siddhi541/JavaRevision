package Polymorphism;
//static method cannot override
//As they are not dependent on object

public class MethodOverriding {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.printHello();         //child method will be called but its not overridden
        obj.printGreeting();

        Parent obj1 = new Parent();
        obj1.printHello();
        obj1.printGreeting();

        Parent obj2 = new Child();
        obj2.printHello();          //Parent method is called even if object of child class is made because static is
                                    // independent of objects
        obj2.printGreeting();       //Child method will be called because object of child class is made and instance
                                    //methods are depend on objects

    }
}

class Parent{
    static void printHello(){
        System.out.println("Hello from static parent");
    }

    void printGreeting(){
        System.out.println("Hii from non-static parent");
    }
}
class Child extends Parent{
//    @Override         //will give an error
    static void printHello(){
        System.out.println("Hello from static child");
    }

    @Override
    void printGreeting(){
        System.out.println("Hii from non-static child");
    }
}