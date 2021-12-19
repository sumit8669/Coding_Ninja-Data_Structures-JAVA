package Lecture3_recursion.Lecture3_recursion_Assignment;

public class Geometric_Sum {
    public static double findGeometricSum(int k){
        double sum=1/Math.pow(2,k);
        if(k==0)
            return 1;
        k--;
        sum=sum+ findGeometricSum(k);
        return sum;
    }

    public static void main(String[] args) {

    }
}
