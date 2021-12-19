package Lecture5_Time_and_Space_Complexity_Analysis.assignment;

public class Pair_Sum_In_Array {
    public static void main(String[] args) {
        int [] array = {2,3,5,4,2,6,5,4,3,6,3,7};
        int target = 12;
        System.out.println(pairSum(array,target));

    }

    public static int pairSum(int[] arr, int num) {
        int count = 0; // Initialize result

        // Consider all possible pairs and check their sums
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == num)
                    count++;

        return count;
    } //N2 time complexity


}
