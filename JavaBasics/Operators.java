import java.lang.*;

class Operators {
    public static void main(String[] args) {
//        increment and decrement
//        first value is assigned to y then incremented

        int x = 10, y;
        y = x++;
        System.out.println(x + " " + y);

//        first a value get incremented then get assigned
        int a = 10, b;
        b = ++ a;
        System.out.println(a + " " + b);


//        bitwise operator
//        and operator
        int m = 10, n = 6, o;
        o = m & n;
        System.out.println(o);

//        or operator
        int p = 10, q = 6, r;
        r = p | q;
        System.out.println(r);

//        xor operator
        int d = 4, e = 8, f;
        f = d ^ e;
        System.out.println(f);

//        left shift
        int X = 3, Y;
        Y = X<<1;
        System.out.println(Y);

//        right shift
        int A = 10, B;
        B = A >>1;
        System.out.println(B);

//        unsigned right shift
        int P = -10, Q;
        Q = P>>>1;
        System.out.println(Q);

//        not operator
        int M = 7,N;
        N = ~M;
        System.out.println(N);







    }
}
