package L3_recursion;

public class Print_Numbers {

    public static void print(int n){
        if(n == 1){
            System.out.print(n + " "); return;
        }
        print(n - 1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        print(90);
    }
}
