package AccessSpecifiers;


public class PrivatePublicpProtected {
    private int num1 = 10;      //can only access in that class
    protected int num2 = 20;    //In different package can only access through subclass
    public int num3 = 30;       //can access through anywhere
    int num4 = 40;              //default - can be access in same package only
    static int num5 = 50;
}


class Main{
    public static void main(String[] args) {
        PrivatePublicpProtected obj = new PrivatePublicpProtected();
//        System.out.println(obj.num1);     //cannot access
        System.out.println();

    }
}