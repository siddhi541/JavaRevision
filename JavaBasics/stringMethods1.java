//length
//is upper
//is lower
//trim
//substring
//replace

import java.lang.*;

class  stringMethods1 {
    public static void main(String[] args) {
        //calculating length
        String str1 = new String("Siddhi Akolkar");
        int len = str1.length();
        System.out.println(len);

        //converting to upper case
        str1 = str1.toUpperCase();
        System.out.println(str1);

        //converting to lower case
        str1 = str1.toLowerCase();
        System.out.println(str1);

        //trimming spaces which are not required
        String str2 = new String("      hello   ");
        str2 = str2.trim();
        System.out.println(str2);

        //substring = it returns specific part of the string
        str1 = str1.substring(3);
        System.out.println(str1);
        str2 = str2.substring(2,4);
        System.out.println(str2);

        //replacing char to different char
        str1 = str1.replace('a' , 's');
        System.out.println(str1);

    }
}
