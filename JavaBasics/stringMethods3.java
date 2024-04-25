//equals
//equals Ignore Case
//compare to
//value of
//contains
//concat

import java.lang.*;
class stringMethods3{
    public static void main(String[] args){
        String str1 = "Siddhi";
        String str2 = new String("Siddhi");
        String str3 = "siddhi";

        System.out.println(str1.equals(str2));

        System.out.println(str1.equalsIgnoreCase(str3));

        System.out.println(str1.compareTo(str3));

        System.out.println(str1.contains("dd"));

        //concat is same as "+" use to concatinate two strings


    }
}