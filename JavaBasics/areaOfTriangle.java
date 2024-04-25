import java.lang.*;
import java.util.*;

class areaOfTriangle{
    public static void main(String[] args) {
//        calculating area of triangle with height and base of the triangle
//        float base, height, area;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Calculating area of triangle\nWhat is base of triangle:");
//        base = sc.nextFloat();
//
//        System.out.println("What is height of triangle:");
//        height = sc.nextFloat();
//
//        area = (base * height) / 2;
//        System.out.println("Area of triangle is:\n" + area);


//        calculating area of triangle using three sides of triangle
        int a, b, c;
        float s, area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter values of three sides of triangle: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        s = (a + b + c) / 2f;

        area = (float)Math.sqrt(s * (s-a) * (s-b) * (s-c));
        System.out.println("Area of triangle is " + area);

    }
}