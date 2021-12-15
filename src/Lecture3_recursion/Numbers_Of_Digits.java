package Lecture3_recursion;

public class Numbers_Of_Digits {

    public static int count(int n){
        if(n ==0 ) return 0;
        int smallint = count(n/10);
        return smallint+1;
    }

    public static void main(String[] args) {
       int ans =  count(687);
        System.out.println(ans);
    }
}
