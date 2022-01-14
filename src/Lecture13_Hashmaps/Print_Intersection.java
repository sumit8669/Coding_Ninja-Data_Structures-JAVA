package Lecture13_Hashmaps;

import java.util.HashMap;
import java.util.Scanner;

public class Print_Intersection {

    public static void printIntersection(int[] arr1,int[] arr2){
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(Integer val : arr1){
            if (hm.containsKey(val)){
                int of = hm.get(val);
                int nf = of+1;
                hm.put(val,nf);
            }else {
                hm.put(val,1);
            }
        }
        for(Integer val : arr2){
            if (hm.containsKey(val) && hm.get(val) > 0){
                System.out.println(val);
                int of = hm.get(val);
                int nf = of-1;
                hm.put(val,nf);
            }
        }

    }


    public static void main(String[] args) {
            Scanner sc  =  new Scanner(System.in);
            int n1  = sc.nextInt();
            int [] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
              arr1[i] = sc.nextInt();
        }
        int n2  = sc.nextInt();
        int [] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        printIntersection(arr1,arr2);

    }
}
