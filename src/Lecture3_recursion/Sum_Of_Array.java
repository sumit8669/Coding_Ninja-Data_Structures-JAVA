package Lecture3_recursion;

public class Sum_Of_Array {
        public static int sum(int[] input) {
            if(input.length ==1) return input[0];
            int []arr=new int[input.length-1];

            System.arraycopy(input, 1, arr, 0, input.length - 1);

            return (input[0]+sum(arr));
        }

    public static void main(String[] args) {

    }
}
