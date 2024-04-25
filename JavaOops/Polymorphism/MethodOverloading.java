package Polymorphism;

//method overloading is static polymorphism / compile time polymorphism

public class MethodOverloading {

    int sum(int a){
        return a;
    }
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println(obj.sum(10));
        System.out.println(obj.sum(21,4));
        System.out.println(obj.sum(2,4,6));
    }
}
