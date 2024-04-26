package JavaRevision.JavaOops.Inheritance;

public class Main {

    public static void main(String[] args) {
        SingleInheritance obj1 = new SingleInheritance();
        Child1 obj2 = new Child1();

        System.out.println(obj1.len);
        System.out.println(obj2.len);

//        parent class referencing to child class
//        which parameters should be accessed is depend on reference of object like here reference is of parent class
//        that's why members of parent class is only accessible
//        we can do this because members of parent class are present in child class
        SingleInheritance obj3 = new Child1();

//        Child obj4 = new Inheritance1();      we cannot do this because members of child class is not present in
//        parent class

//        MULTILEVEL INHERITANCE
        B obj5 = new B(5,19,130);
        System.out.println(obj5.age);       //content of grandparent class are also accessible
    }
}
