package JavaRevision.ExceptionHandling;

public class CustomException extends Exception{

    CustomException(String message){
        super(message);
    }

    public static void main(String[] args) {
       try{
           String name = "siddhi";
           if(name.equals("siddhi")){
               throw new CustomException("Name is invalid");
           }
       }catch (CustomException e){
           System.out.println(e.getMessage());
       }
    }
}
