package L3_recursion_Assignment;

public class Count_Zeros {
    public static int countZerosRec(int input) {
        if (input < 10) {
             if (input == 0) return 1;
             else return 0;
        }else {
            if(input % 10 == 0) return countZerosRec(input / 10) +1;
            else return countZerosRec(input/10);
        }
    }

    public static void main(String[] args) {
            int num = 906900500;
        System.out.println(countZerosRec(num));
    }
}
