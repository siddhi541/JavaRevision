package JavaRevision.JavaOops.ObjCompAndLambdaFunc;

//to compare two objects we have to use comparable interface
class objCom implements Comparable<objCom>{
    int roll;
    float marks;

    public objCom(int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }


    @Override
    public int compareTo(objCom o) {
        return (int)(this.marks-o.marks);
//        if returned value is equal to 0 both objects are equal
//        if returned value is < 0 o is bigger
//        if returned value is > 0 o is smaller
    }
}

public class ObjCompare {
    public static void main(String[] args) {
        objCom obj1 = new objCom(12, 90.2f);
        objCom obj2 = new objCom(31, 89.0f);

        if(obj1.compareTo(obj2) == 0){
            System.out.println("Both are equal");
        }

        else if(obj1.compareTo(obj2) < 0){
            System.out.println("obj2 is greater than obj1");
        }
        else{
            System.out.println("obj1 is greater than obj2");
        }
    }
}
