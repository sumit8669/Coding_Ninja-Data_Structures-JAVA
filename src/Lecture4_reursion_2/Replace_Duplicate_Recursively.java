package Lecture4_reursion_2;

public class Replace_Duplicate_Recursively {
    public static String removeConsecutiveDuplicates(String s) {
            if (s.length() == 1) return s;
            String ans = "";
            if (s.charAt(0) != s.charAt(1)) ans += s.charAt(0);
        return ans+removeConsecutiveDuplicates(s.substring(1));

    }
    public static void main(String[] args) {
     String str = "xxxyyyzwwzzz";
        System.out.println(removeConsecutiveDuplicates(str));
    }
}
