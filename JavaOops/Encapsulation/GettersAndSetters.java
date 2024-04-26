package JavaRevision.JavaOops.Encapsulation;

public class GettersAndSetters {
    private int num1;
    static int num2;
    int num3;

    int getNum1(){
        return num1;
    }

    void setNum1(int num){
        this.num1 = num;
    }

}

class Main{
    public static void main(String[] args) {
        GettersAndSetters obj = new GettersAndSetters();
//        obj.num1 = 10;            //cannot access private
        GettersAndSetters.num2 = 12;  //static
        obj.num3 = 90;              //instance variables

//        access private variables using getters and setters
        obj.setNum1(123);
        System.out.println(obj.getNum1());
    }
}