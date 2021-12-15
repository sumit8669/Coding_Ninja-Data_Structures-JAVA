package L3_recursion_Assignment1;

public class Remove_X {
    public static String removeX(String input){
        return remove(input);
    }

    public static String remove(String str){
        if (str.length() == 0) return "";

        if (str.charAt(0) == 'x') return remove(str.substring(1));
        return str.charAt(0) + remove(str.substring(1) );
    }

    public static void main(String[] args) {
    String str = "xaxxxxbxxxyyxxaazzxx";
        System.out.println(removeX(str));
    }
}
