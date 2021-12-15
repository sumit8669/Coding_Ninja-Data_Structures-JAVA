package Lecture3_recursion_Assignment1;

public class Pair_Star {
    public static String addStars(String s) {
         if (s.length() ==1) return s;
         if (s.charAt(0) == s.charAt(1)) return s.charAt(0)+"*"+addStars(s.substring(1));
         return s.charAt(0) + addStars(s.substring(1));
    }
    public static void main(String[] args) {
        String str = "aabbaacc";
        System.out.println(addStars(str));
    }
}
