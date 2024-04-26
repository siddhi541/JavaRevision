package JavaRevision.JavaOops.Inheritance;

//One class extends another class that class also extends another class

public class Multilevel {

    int age;
    public Multilevel(int age){
        this.age = age;
    }
}

class A extends Multilevel{
    int weight;
    public A(int age, int weight){
        super(age);
        this.weight = weight;
    }
}

class B extends A{
    int height;
    public B(int age, int weight, int height){
        super(age, weight);
        this.height = height;
    }
}