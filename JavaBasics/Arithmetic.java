import java.lang.*;
import java.util.*;

//     you can change data types of literals ,
//        whatever the data types of literals (byte, short, int, long, char) the result will be an integer always
//      the compatibility between data types and result of an expression is equal to the largest data type used in a
//      expression

class Arithmetic {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter two numbers:");
        Scanner sc = new Scanner(System.in) ;
        a = sc.nextInt();
        b = sc.nextInt();
        int c = a + b;
        int d = a / b;
        int e = a % b;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
