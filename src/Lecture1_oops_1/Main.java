package Lecture1_oops_1;
public class Main {
    public static void main(String[] args) {
        int num = 11 ;
        int ans  = fibo(num);
        System.out.println(ans);
    }
    public  static int  fibo(int n){
        if(n == 0 || n == 1) return n;

        return  fibo( n -1) + fibo(n-2);

    }
}
