package L3_recursion;

public class Check_Sorted_Better {
    private static boolean checkSorted(int [] input,int startIndex){
        if(startIndex >= input.length-1){
            return  true;
        }
        if(input[startIndex]>input[startIndex+1])
            return false;
        return checkSorted(input,startIndex+1);
    }
    public static boolean checkSorted(int [] index){
        return checkSorted(index,0);
    }

    public static void main(String[] args) {
        int []a1 = {1,23,45,67,89};
        System.out.println(checkSorted(a1));
    }
}
