package JavaRevision.JavaOops.Inheritance;

//when child inherits the parent class object of it can access all the properties of parent class except private one but,
//object of parent class will not be able to access the properties of child class

public class SingleInheritance {
    int len;
    int wid;
    int hei;
    private int area;

    SingleInheritance(){
//        super();          //super can be used to call constructor of parent class
                            //or it can be used as this keyword to access properties of parent class directly
        this.len = 0;
        this.wid = 0;
        this.hei = 0;
    }

    SingleInheritance(int side){
        this.len = side;
        this.wid = side;
        this.hei = side;
    }

    SingleInheritance(int len, int wid, int hei){
        this.len = len;
        this.wid = wid;
        this.hei = hei;
    }

}

class Child1 extends SingleInheritance{
    int weight;
//if we do not call super it will call default constructor of parent
    Child1(){
        super();        //calls constructor of parent class with no arguments
        this.weight = 0;

//        child can access the properties of parent class if it is non-static the copy of property is made in child
//        object , which you can access or modify
//        this.len = 10;
    }
    Child1(int weight){
      super(weight);        //calls constructor of parent class with one argument
      this.weight = weight;
    }
    Child1(int len, int wid, int hei, int weight){
        super(len, wid, hei);       //calls constructor of parent class with all arguments if no of arguments are not
                                    //equal it throws an error

        this.weight = weight;
//        this.area = 10;           //child class cannot access private variables / methods form parent class
    }
}
