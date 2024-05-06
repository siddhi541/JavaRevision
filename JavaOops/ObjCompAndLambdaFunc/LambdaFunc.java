package JavaRevision.JavaOops.ObjCompAndLambdaFunc;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunc {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            arr.add(i+1);
        }

//        item in for each loop represents single element in an array
//        arr.forEach((item) -> System.out.println(item * 2));
//        lambda function
        Consumer<Integer> fun = (item) -> System.out.println(item * 2);

//        calling via for each loop as for each loop takes consumer type as an input
        arr.forEach(fun);

//        declaring method from Operation interface in different types
        Operation sum = (a, b) -> a+b;
        Operation sub = (a, b) -> a-b;
        Operation multi = (a, b) -> a * b;
        Operation div = (a, b) -> a / b;

        LambdaFunc calc = new LambdaFunc();
        System.out.println(calc.operate(2, 9, sum));
    }

    private int operate(int a, int b, Operation op){
        return op.opt(a, b);
    }
}

interface Operation{
//    for multiple function calling and for different types of parameters use interfaces
    int opt(int a, int b);
}