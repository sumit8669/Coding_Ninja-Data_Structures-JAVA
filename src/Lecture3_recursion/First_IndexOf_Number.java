package Lecture3_recursion;

public class First_IndexOf_Number {
    public static int firstIndex(int[] input, int x) {
        return indexPosition(input,0,x);
    }
    private static int indexPosition(int[]input, int idx,int x){
        if(idx == input.length) return -1;
        if(input[idx]==x) return idx;
        else return indexPosition(input,idx+1,x);
    }

    public static void main(String[] args) {
        int [] ar1 = {23,43,55,88,65,43};
        int x =43;
        System.out.println(firstIndex(ar1,x));
    }
}
