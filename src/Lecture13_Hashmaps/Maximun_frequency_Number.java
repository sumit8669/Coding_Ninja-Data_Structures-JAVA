package Lecture13_Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class Maximun_frequency_Number {
    public static int maxFrequencyNumber(int[] arr){
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer , Integer> countMap  = new HashMap<>();
        for (int element : arr) {
            if (countMap.containsKey(element))
                countMap.put(element, countMap.get(element) + 1);
            else countMap.put(element, 1);
        }

        int maxCount = Integer.MIN_VALUE, maxEle = arr[0];
        for (int j : arr) {
            if (countMap.get(j) > maxCount) {
                maxCount = countMap.get(j);
                maxEle = j;
            }
        }
        return maxEle;
    }
    public static void main(String[] args) {

    }
}
