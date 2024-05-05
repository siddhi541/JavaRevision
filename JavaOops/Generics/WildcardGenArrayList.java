package Generics;

//if you want arraylist to be one type only like any type of numbers are allowed
//then you can use wildcard in generics

import java.util.Arrays;

public class WildcardGenArrayList<T extends Number> {
//    here T extends Numbers means the Generic value inside T should only be of number type
//    it can be integer / float

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildcardGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        Object[] temp = new Object[data.length * 2];

        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public void add(T value){
        if(isFull()){
            resize();
        }
        data[size++] = value;
    }

    public T remove(){
        T removed = (T)data[--size];
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString(){
        return Arrays.toString(data);
    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
        WildcardGenArrayList<Integer> listI = new WildcardGenArrayList<>();
        WildcardGenArrayList<Float> listF = new WildcardGenArrayList<>();

//        as we defined T extends Number we cannot create arraylist other than number type
//        WildcardGenArrayList<String> listS = new WildcardGenArrayList<String>();
    }
}

