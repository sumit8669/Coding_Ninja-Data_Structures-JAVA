package Test1;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Profit_on_App {
    //Logic Class
    public static int maximumProfit(int[] budget) {
        // Write your code here
        int ans=Integer.MIN_VALUE;
        int n=budget.length;
        // sort(budget,budget+n);
        Arrays.sort(budget);
        for(int i=0;i<n;i++)
        {
            ans=Math.max(ans,budget[i]*(n-i));
        }
        return ans;
    }

    //Main Class
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] input = new int[n];
        for(int i=0;i<n;i++)
            input[i] = s.nextInt();

        System.out.println(maximumProfit(input));
    }

}
