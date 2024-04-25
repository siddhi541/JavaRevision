import java.lang.*;
import java.util.*;

class cuboidAreaAndVolume {
    public static void main(String[] args) {
        int length, breadth, height, area, volume;

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter value of length, breadth and height of the cuboid");

        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        int area1 = (length * height) + (length * height);
        int area2 = (breadth * height) + (breadth * height);
        int area3 = (length * breadth) + (length * breadth);

        area = area1 + area2 + area3;
        volume = length * breadth * height;

        System.out.println("Area of cuboid is: " + area + "\nvolume of a cuboid is: " + volume);





    }
}