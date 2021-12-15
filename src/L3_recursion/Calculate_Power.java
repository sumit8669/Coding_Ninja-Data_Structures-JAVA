package L3_recursion;

public class Calculate_Power {
    public static int power(int x , int n){
        if (n == 1)return x;
        if(n==0) return 0;
        int small = power(x,n-1);
        return x * small;
    }
    public static void main(String[] args) {
        int ans = power(3,4);
        System.out.println(ans);
    }

}
