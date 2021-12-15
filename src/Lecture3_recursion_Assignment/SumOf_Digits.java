package Lecture3_recursion_Assignment;

public class SumOf_Digits {
    public static int sumOfDigits(int input){
        if(input == 0) return 0;
        return input % 10 + sumOfDigits(input/10);
    }

    public static void main(String[] args) {
        int num = 1999;
        System.out.println(sumOfDigits(num));
    }
}
