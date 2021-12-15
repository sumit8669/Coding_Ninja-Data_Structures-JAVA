package L5_Time_and_Space_Complexity_Analysis;
import java.util.Arrays;

public class Array_Intersection {
    public static void main(String[] args) {
        int [] ar1 = {2,3,5,2,7,5,8,9,5,4,3,1};
        int [] ar2 = {2,4,2,4,7,6,4,3,6,7,3};

        arrayIntersection(ar1,ar2);

        }

    public static void arrayIntersection(int [] a1 ,int [] a2){
        int []list = new int[a2.length];
         Arrays.sort(a1);
        Arrays.sort(a2);
        int i =0 , j = 0 ;
        while (i < a1.length ){
            if (a1[i] == a2[j]){
                list[i] = a1[i];
                System.out.print(list[i]+ " ");
                i++; j++;
            }else {
                i++;
            }
        }

    }
}
