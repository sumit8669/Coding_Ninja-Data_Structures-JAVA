package Lecture3_recursion;

public class Last_IndexOf_Number {
    public static int lastIndex(int[] input, int x) {
        return indexPosition(input,0,x);
    }
    public static int indexPosition(int[]input, int idx,int x){
        if(idx == input.length) return -1;
        int lastIndex=indexPosition(input,idx+1,x);
        if (lastIndex == -1) {
            if (input[idx] == x) return idx;
            else return -1;
        }else return lastIndex;
    }

    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88,99,77,66,11};
        int x = 66;

        System.out.println(lastIndex(arr,66));
    }
}
