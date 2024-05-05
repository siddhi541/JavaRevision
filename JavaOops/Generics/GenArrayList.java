package Generics;

import java.util.Arrays;

public class GenArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public GenArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
//        creating array of double the previous array
        Object[] temp = new Object[data.length * 2];

//        copying old array into new array
        for (int i = 0; i < data.length; i++){
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

    public T get (int index){
        return (T)data[index];
    }

    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
//        By providing generics we can make arraylist of any datatype(primitives not allowed)

        GenArrayList<Integer> list = new GenArrayList<>();
        list.add(1);
        list.add(9);
        System.out.println(list);

        GenArrayList<String> list1 = new GenArrayList<>();
        list1.add("siddhi");
        list1.add("akanksha");
        System.out.println(list1);

        GenArrayList<Float> list2 = new GenArrayList<>();
        list2.add(12f);
        list2.add(2.9f);
        list2.add(91.3f);
        System.out.println(list2);
    }
}

