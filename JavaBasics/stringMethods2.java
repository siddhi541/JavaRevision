//starts with
//ends with
//char at
//index of
//last index

import java.lang.*;

class stringMethods2 {
    public static void main(String[] args) {
        String str = new String("Siddhiakolkar48@gmail.com");

        //if the string starts with provided letters it will return true
        //same for ends with method
        System.out.println(str.startsWith("Sid"));
        System.out.println(str.startsWith("48", 13));

        //returns character present at provided index
        System.out.println(str.charAt(5));

        //returns index of provided character or string
        System.out.println(str.indexOf('.'));

        //last index starts searching from last index
        System.out.println(str.lastIndexOf("o"));

    }
}