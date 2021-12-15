package L4_reursion_2.assignment;

public class Check_AB {

    public static boolean checkAB(String input) {
        if (input.length() ==0) return true;

        if (input.charAt(0) == 'a') {
            if (input.substring(1).length() > 1 && input.startsWith("bb", 1)){
                return checkAB(input.substring(3));
            }else {
                return checkAB(input.substring(1));
            }
        }
        return false;
    }

    public static void main(String[] args) {
      String str = "abbaa";

        System.out.print(checkAB(str));

    }
}
