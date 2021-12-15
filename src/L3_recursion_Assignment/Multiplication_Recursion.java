package L3_recursion_Assignment;

public class Multiplication_Recursion {
    public static int multiplyTwoIntegers(int m, int n){
        if(n == 1) return m;
        return m+multiplyTwoIntegers(m,n-1);
    }
    public static void main(String[] args) {

        System.out.println(multiplyTwoIntegers(8,45));
    }
}
