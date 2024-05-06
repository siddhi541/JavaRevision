package JavaRevision.JavaOops.AccessSpecifiers;//use case of singleton class is we can only make one object of that class
//by making a constructor private we restrict making object outside of this file and hence we cannot make another
//instance but can only call same instance as many times as we want

public class SingletonClass {
    private SingletonClass(){

    }
    private static SingletonClass instance;

    public static SingletonClass getInstance(){
        if (instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }
}
