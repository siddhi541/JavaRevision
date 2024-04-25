import java.lang.*;
import java.util.*;

class quadraticEquation {
    public static void main(String[] args) {
        float a, b, c;
        double r1, r2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculating roots of quadratic equation.\nEnter the value of coefficients (a, b) and constant c");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();


        r1 = (-b+Math.sqrt(b*b-4*a*c)) / (2 * a);

        r2 = (-b-Math.sqrt(b*b-4*a*c)) / (2 * a);

        System.out.println("The roots of quadratic equation is: " + r1 + " and " + r2);


    }
}