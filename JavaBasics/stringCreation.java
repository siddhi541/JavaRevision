import java.lang.*;

class stringCreation {
    public static void main(String[] args) {
        //creating normal string
        //here str1 is reference pointing or referring to JAVA which is created in SCP
//        String str1 = "JAVA";
//        System.out.println(str1);
//
//
//        //creating via new object.
//        //new object is crated that's why literal will be saved inside a heap and reference is pointing towards it...and
//        //if that literal is not already present inside SCP new literal is saved
//        String str2 = new String("JAVA PROGRAMMING");
//        System.out.println(str2);
//
//
//        //using char constructor
//        char[] c = {'H','E','L','L','O'};
//        String str3 = new String(c);
//        System.out.println(str3);
//
//
//        //using byte constructor
//        byte[] b = {65,66,67,68};
//        String str4 = new String(b);
//        System.out.println(str4);
//
//        //string constant pool
//        //if literals are same both references will point to the single object inside the scp
//        String str5 = "Java";
//        String str6 = "Java";
//        System.out.println(str5 == str6);
        // this will return true if both references pointing to the same object in scp

        String str7 = new String("Java");
        String str8 = "Java";
        System.out.println(str7 == str8);
        //this will return false because str7 pointing inside heap and str8 pointing towards scp


    }
}