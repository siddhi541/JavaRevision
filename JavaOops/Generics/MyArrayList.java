package Generics;

import java.util.Arrays;

public class MyArrayList {

    private int[] data;
    private static int DEFAULT_SIZE= 10;
    private int size = 0;

    public MyArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }


    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
//        creating new array of double the size
        int[] temp = new int[data.length * 2];

//        copying old array in new array
        for (int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public int size(){
        return size;
    }

    public static void main(String[] args){
//        ArrayList list = new ArrayList();

//        customized arraylist
        MyArrayList list = new MyArrayList();
        list.add(1);
        list.add(3);
        list.add(5);
        System.out.println(list);
//        there is problem with this custom array list as it only allows integer type
//        data
//        need to use generics to make custom array list of any datatype
    }
}
