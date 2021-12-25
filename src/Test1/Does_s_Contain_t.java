package Test1;

import java.util.Scanner;

public class Does_s_Contain_t {
    //Logic Class and Helper Class
    public static boolean checkSequence(String a, String b) {
        int m=a.length();
        int n=b.length();
        return isSubSequence(b,a,n,m);
    }
    public static boolean isSubSequence(String str1, String str2, int m, int n)
    {
        if (m == 0)
            return true;
        if (n == 0)
            return false;
        if (str1.charAt(m-1) == str2.charAt(n-1))
            return isSubSequence(str1, str2, m-1, n-1);
        return isSubSequence(str1, str2, m, n-1);
    }

    //Main Class
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String large = s.nextLine();
        String small = s.nextLine();

        System.out.println(checkSequence(large, small));
    }
}
