package L5_Time_and_Space_Complexity_Analysis;

public class Duplicate_In_Array {
        public static int findDuplicate(int[] arr) {
            int sumOfNaturalNum = 0;
            for (int i = 0; i < arr.length-1 ; i++) {
                sumOfNaturalNum +=i;
            }
            int sumOfNum = 0;
            for (int j : arr) {
                sumOfNum += j;
            }
            return sumOfNum - sumOfNaturalNum ;
        }

        public static void main(String[] args) {
            int []  input = {0 ,3 ,1 ,5, 4 ,3 ,2};
            int ans  = findDuplicate(input);
            System.out.println(ans);
        }

}
