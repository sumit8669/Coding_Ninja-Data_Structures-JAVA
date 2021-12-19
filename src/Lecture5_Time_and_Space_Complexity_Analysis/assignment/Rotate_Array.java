package Lecture5_Time_and_Space_Complexity_Analysis.assignment;

public class Rotate_Array {
    public static void rotate(int[] arr, int d) {
        // 1st two lines
        d = d % arr.length;
        if(d < 0 ) d = d+ arr.length;
        reverse(arr,0, arr.length-1);
        reverse(arr,0, arr.length-d-1);
        reverse(arr,arr.length-d, arr.length-1);


    }

    private static void reverse(int [] arr, int start , int end){
        while (start< end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]  = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
         int [] arr = {1,2 ,3, 4};  //output must be 3 4 1 2
         rotate(arr,2);
            for (int element : arr) {
                System.out.print(element + " ");
            }
    }
}
