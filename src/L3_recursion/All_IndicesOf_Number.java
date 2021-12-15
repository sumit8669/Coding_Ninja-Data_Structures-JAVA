package L3_recursion;

public class All_IndicesOf_Number {
    public static int[] allIndices(int [] input , int x ,int idx , int fsf){
        if (idx == input.length) return new int[fsf];

        if (input[idx] == x) {
          int [] arr =  allIndices(input, x, idx + 1, fsf + 1);
          arr[fsf] = idx;
          return arr;
        }else{
            return allIndices(input, x, idx + 1, fsf );
        }
    }
    public static int[] allIndexes(int input[], int x) {
            return allIndices(input,x,0,0);
    }

    public static void main(String[] args) {
        int [] array = {11,22,33,44,55,66,77,88,12,22,44,22,33,11,22,22,22,22,43};
        int x  =22;
        int [] ans  = allIndexes(array,22);
        for (int val : ans){
            System.out.println(val);
        }
    }
}
