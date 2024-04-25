import java.lang.*;

class regularExpression {
    public static void main(String[] args) {
        //matching symbols
        String str1 = "a";
        //any character present inside a string but only one time returns true
        System.out.println(str1.matches("."));

        String str2 = "a";
        //only single character should be present from given set of list returns true
        System.out.println(str2.matches("[abcd]"));

        String str3 = "ax";
        //any one element from first set and any one element from second set returns true
        System.out.println(str3.matches("[abc][xyz]"));

        String str4 = "b";
        //single character and should not be present inside given set returns true
        System.out.println(str4.matches("[^abc]"));

        String str5 = "&";
        //single element inside a string should be from a to z or 0 to 9 returns true
        System.out.println(str5.matches("[a-z0-9]"));

        String str6 ="A";
        //element should be A or B returns true
        System.out.println(str6.matches("A|B"));

        String str7 = "ab";
        //element should be exactly same as given set returns true
        System.out.println(str7.matches("abc"));


        //meta characters
        String STR1 = "21";
        //checks if string is single digit and returns true
        // \d returns true if string is digit and \D returns true if string is not a digit
        // \s returns true if string is space and \S returns true if string is not a space
        // \w returns true if string is digit or alphabet and \W returns true if string is not a digit or alphabet
        System.out.println(STR1.matches("\\d"));


        //quantifiers
        //we ue it with matching symbols
        String STR = "siddhi";
        //any character zero or many times(*)
        // for one or more times (+)
        //for zero or one time (?)
        //{n} for specific given number of times
        //{n,m} starting from n ending at m
        System.out.println(STR.matches(".*"));










    }
}
