package L3_recursion;

public class Check_Sorted_ArrayRecursion {
    public static boolean checkSorted(int []input){
        if(input.length <=1) return true;

        int [] smallInput = new int[input.length-1];
        //BEAST WAY TO COPY ARRAYS
        System.arraycopy(input, 1, smallInput, 0, input.length - 1);

        boolean smallAns = checkSorted(smallInput);
        if(!smallAns) return false;
        return input[0] <= input[1];

    }
    public static void main(String[] args) {

        int [] input = {1,1,3,6,9};
        System.out.println(checkSorted(input));
    }
}
