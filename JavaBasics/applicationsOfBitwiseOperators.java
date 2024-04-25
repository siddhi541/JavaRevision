import java.lang.*;

class applicationOfBitwiseOperators {
    public static void main(String[] args) {
        // Swapping two numbers without using third variable
//        int a = 12, b = 9;
//
//        System.out.println(a + " " + b);
//
//        a = a^b;
//        b = a^b;
//        a = a^b;
//
//        System.out.println(a + " " + b);
//    }

        //saving 2 numbers in single variable
        byte a = 9, b = 12;
        a = (byte)(a << 4);
        a = (byte) (a | b);
        System.out.println((a & 0b11110000) >> 4);
        System.out.println(a & 0b00001111);

    }
}