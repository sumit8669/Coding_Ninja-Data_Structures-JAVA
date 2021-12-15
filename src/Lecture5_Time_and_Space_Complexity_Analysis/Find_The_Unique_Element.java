package Lecture5_Time_and_Space_Complexity_Analysis;

public class Find_The_Unique_Element {
    public static int findUnique(int[] arr) {
        int uni = 0;
        for (int j : arr) {
            uni = uni ^ j;
        }
        return uni;
    }


    public static void main(String[] args) {
        int [] input = {1, 3, 1 ,3, 6, 6, 7 ,10, 7};
        int ans =findUnique(input);
        System.out.println(ans);
    }
}
