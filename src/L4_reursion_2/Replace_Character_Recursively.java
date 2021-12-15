package L4_reursion_2;

public class Replace_Character_Recursively {
    public static String replaceCharacter(String input, char c1, char c2) {
        if(input.length() == 0) return input;
        String ans ="";
        if(input.charAt(0) == c1) {
            ans += c2;
        } else ans += input.charAt(0);

        String smallAns = replaceCharacter(input.substring(1),c1,c2);

        return ans+smallAns;
    }

    public static void main(String[] args) {
        String str = "abacd";
        char c1 ='a', c2 ='x';

        System.out.println(replaceCharacter(str, c1, c2));
    }
}
