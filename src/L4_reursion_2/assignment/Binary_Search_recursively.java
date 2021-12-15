package L4_reursion_2.assignment;

public class Binary_Search_recursively {
    public static int binarySearch(int[] input, int element) {
        return findIndex(input,element,0,input.length-1);
    }

    private static int findIndex(int []input , int element , int start , int end){
        if(start > end) return -1;
        int mid = (start +end) / 2;
        if(input[mid] == element) return mid;
        if (element > input[mid]) return findIndex(input,element,mid+1,end);
        return findIndex(input,element,start,mid-1);

    }
    public static void main(String[] args) {
        int []  arr = {1,2,3,4,5,6,7,8,9,23,34,45,56,67,78};
        int x = 67;
        System.out.println(binarySearch(arr,x));
    }
}
