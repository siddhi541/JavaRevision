package AccessSpecifiers;//main method in static because it is an entry point function which will be called by jvm and jvm should call main
//without making an object of it.
//any non-static context is not callable inside a static context directly, you need to make an object of it
//just like below, we cannot call greeting method directly as it is not static

//if one object made change in static content it will be visible by all other objects

public class StaticRevise {
    int number = 12;
    static int num2 = 1;
    static int num;

//    this static block acts as constructor but will only call once when first object is created and class is loaded
    static {
        System.out.println("Hello static");
        num = num2 * num2;
    }
//    public static void main(String[] args) {
////        greeting();
//        StaticRevise obj = new StaticRevise();
//        obj.greeting();
//
//    }

    //    you need to make an object of class to use instance variable/methods you can not call them directly in static
//    method, but you can call instance methods and variables  from non-static/instance method directly.
    void call_greeting() {
        greeting();
        stat_greet();
    }

    //we cannot call non-static method from static method directly, but we can call static method from non static method
    static void stat_greet() {
        System.out.println("hello non static");
        //you cannot use "this" keyword to access instance var in static method as this is actually object referance and
//        static is independent of object
//        System.out.println(this.number);
    }

    void greeting() {
        System.out.println("Hello world");
    }
}

class outer {
    class inner{
//        only inner classes can be static not the outer class
//        as we know static context is class dependent so if we make outer ckass as static on which class will it depend
        static String name = "siddhi";
    }
    class main{
        public static void main(String[] args) {
//            outer.inner obj = new outer.inner();

        }
    }
}


