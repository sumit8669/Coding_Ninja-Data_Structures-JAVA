package Lecture4_reursion_2;

public class Merge_Sort_Code {
    public static void mergeSort(int[] input){
        if (input.length<=1) return;;
        int mid = input.length / 2;
        int [] part1 = new int[mid];
        System.arraycopy(input, 0, part1, 0, mid);
        int [] part2 = new int[input.length - mid];
        int k = 0;
        for (int i = mid; i <input.length ; i++) {
            part2[k] = input[i];
            k++;
        }
        mergeSort(part1);
        mergeSort(part2);
      merge(part1 , part2 , input);
    }

    private static void merge(int[] part1, int[] part2, int[] input) {
        int i =0 , j = 0 , k = 0 ;
        while (i < part1.length && j < part2.length ){
            if (part1[i] < part2[j]) {
                 input [k] = part1[i];
                 i++;
            }else {
                input [k] = part2[j];
                j++ ;
            }
            k++;
        }
        while ( i < part1.length){
            input[k] = part1[i];
            i++; k++;
        }
        while (j < part2.length){
            input[k] = part2[j];
            j++ ; k++;
        }
    }

    public static void main(String[] args) {
        int [] arr = {9,6,5,7,3,2,4,1,65,78,94,32,10};
        mergeSort(arr);
        for (int val : arr ) {
            System.out.print(val+" ");
        }
    }
}
