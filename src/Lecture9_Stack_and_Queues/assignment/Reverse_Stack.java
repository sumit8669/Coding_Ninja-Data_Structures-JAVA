package Lecture9_Stack_and_Queues.assignment;


import java.util.Stack;

public class Reverse_Stack {
    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
        if(input.size()==0 ||extra.size()==1 )
        {  return;}

        int temp=input.pop();

        reverseStack(input,extra);

        while(!input.isEmpty()) {
            extra.push(input.pop());
        }

        input.push(temp);

        while(!extra.isEmpty()) {
            input.push(extra.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> arr = new Stack<>();
        for (int i = 1; i <= 5; i++) {
               arr.push(i);
        }
        Stack<Integer> arr2 = new Stack<>();
        reverseStack(arr,arr2);
        for (Integer val : arr){
            System.out.print(val+" ");
        }
    }
}