import java.lang.*;

public class regullarExpressionExercise {
    public static void main(String[] args) {
        //return true if string contain gmail
        //separate domain name and username
//        String str = "siddhiakolkar@gmail.com";
//        int index = str.indexOf("@");
//
//        String uname = str.substring(0, index);
//        String domain =  str.substring(index+1);
//
//        System.out.println("Username: " + uname);
//        System.out.println("Domain: " + domain);
//        System.out.println(domain.startsWith("gmail"));


        //find if number is binary or not
//        int b = 1010111100;
//        String str1 = b + "";
//
//        System.out.println(str1.matches("[01]+"));
//
//        //find given number is hexadecimal or not
//        String str2 = "0983AFE";
//        System.out.println(str2.matches("[0-9A-F]+"));
//
//        //find given number in date format or not
//        String str3 = "36/12/2001";
//        System.out.println(str3.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));

        //remove special char
        String str4 = "@De$as^bfg235%&";
        System.out.println(str4.replaceAll("[^a-zA-z0-9]", ""));

        //remove extra spaces
        String str5 = "s  e  cede    edscf";
        System.out.println(str5.replaceAll("\\s", " "));




    }
}