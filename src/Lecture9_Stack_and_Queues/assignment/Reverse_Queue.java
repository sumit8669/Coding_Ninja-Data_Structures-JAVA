package Lecture9_Stack_and_Queues.assignment;

import java.util.*;

public class Reverse_Queue {
    public static void reverseQueue( Queue<Integer> input) {
        Stack<Integer> st = new Stack<>();
        while (!input.isEmpty()){
            st.push(input.peek());
            input.poll();
        }
        while (!st.isEmpty()){
            int temp = st.pop();
            input.add(temp);
        }
    }

    public static void main(String[] args) {
        Queue<Integer> arr = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            arr.add(i);
        }

        reverseQueue(arr);
        for (Integer val : arr) {
            System.out.print(val + " ");
        }

    }
}
