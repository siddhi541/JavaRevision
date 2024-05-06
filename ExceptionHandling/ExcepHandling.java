package JavaRevision.ExceptionHandling;

//Difference between error and exception
//error -> non-recoverable , program cannot handle it, e.g. = syntax error, stackoverflow error
//exception -> recoverable, program can handle it, e.g. = arithmetic exception(num/0), null pointer exception

public class ExcepHandling {

    public static void main(String[] args) {
        typeOneException(12, 0);
        try{
            typeTwoException(32,0);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    static void typeOneException(int a, int b){
//        one way -> using try-catch-finally
//        you can add more than one catch blocks but more strict exception should come at top
//        like Arithmetic exception should come before normal exception, otherwise it will throw an error
//        there can only be one finally block

        try{
            int c = a / b;
        }
        catch (Exception e){
//            arithmetic exception
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This will always execute");
        }
    }

    static int typeTwoException(int a, int b) throws ArithmeticException{
//        second way -> using throw new exception
        if(b == 0){
            throw new ArithmeticException("Do not divide by zero");
        }

        return a / b;
    }
}
