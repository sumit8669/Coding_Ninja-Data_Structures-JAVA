package Lecture3_recursion.Lecture3_recursion_Assignment;

public class CheckPalindrome_Recursion {
    public static boolean isStringPalindrome(String input) {
      if(input.length() <=1) return true;

      if(input.charAt(0) == input.charAt(input.length()-1))
          return isStringPalindrome(input.substring(1,input.length()-1));
      else return false;
    }

    public static void main(String[] args) {
        String str  = "abbcssvsscbba";

        System.out.println(isStringPalindrome(str));
    }
}
