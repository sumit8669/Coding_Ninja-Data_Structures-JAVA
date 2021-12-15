package Lecture4_reursion_2;

public class String_Subsequences {
    public static String [] findsubsequence(String str){
        //BASE CASE
        if (str.length() == 0) {
            return new String[]{""};
          //  String [] ans = {}; return  ans;
        }

        String [] smallAns = findsubsequence(str.substring(1));
        String [] ans = new String[2 * smallAns.length];
        int k = 0;
        for (String smallAn : smallAns) {
            ans[k] = smallAn;
            k++;
        }
        for (String smallAn : smallAns) {
            ans[k] = str.charAt(0) + smallAn;
            k++;
        }
        return ans;
    }

    public static void main(String[] args) {
         String str = "xyz";
         String [] ans =findsubsequence(str);
         for (String val : ans){
             System.out.print(val + " ");
         }
    }
}
