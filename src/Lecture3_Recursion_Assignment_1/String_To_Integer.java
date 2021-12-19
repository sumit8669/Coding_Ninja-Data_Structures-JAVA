package Lecture3_Recursion_Assignment_1;

public class String_To_Integer {
    //Method 1
    public static int convertStringToInt1(String input){
        return Integer.parseInt(input);
    }
    //Method 2
    public static int convertStringToInt2(String input){
        if (input.length() ==1) return input.charAt(0) - '0';
        int smallOutput = convertStringToInt2(input.substring(0,input.length()-1));
        int lastDigit = input.charAt(input.length()-1) - '0';
        
        return smallOutput * 10 + lastDigit;
    }

    public static void main(String[] args) {
      String str = "0034";
        System.out.println(convertStringToInt1(str));
        System.out.println(convertStringToInt2(str));
    }
}
