package Lecture3_recursion_Assignment1;

public class Replace_Pi {
    public static String replacePi(String input ){
        if(input.length() <=1) return input;
            if (input.charAt(0) == 'p' && input.charAt(1) == 'i') {
                return "3.14" + replacePi(input.substring(2));
            }
        return input.charAt(0) + replacePi(input.substring(1));
    }

    public static void main(String[] args) {
        String str = "pipipipipippipiiibabapipaa";

        System.out.println(replacePi(str));
    }
}
