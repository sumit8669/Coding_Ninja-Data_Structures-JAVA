package Lecture9_Stack_and_Queues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Balanced_Parenthesis {

    class Solution {

        public static boolean isBalanced(String expression) {
            Stack <Character> st = new Stack<>();
            for (int i = 0; i < expression.length(); i++) {
                if(expression.charAt(i) == '(' || expression.charAt(i) == '{' || expression.charAt(i) == '[' )
                  st.push(expression.charAt(i));
                else{
                    if (st.isEmpty()) return false;
                    else {
                        char pop_val = st.pop();
                        if (expression.charAt(i) == ')' && pop_val != '('){
                            return false;
                        }
                        else if (expression.charAt(i) == '}' && pop_val != '{'){
                            return false;
                        }
                        else if (expression.charAt(i) == ']' && pop_val != '['){
                            return false;
                        }
                    }
                }
            }
         return st.isEmpty();
        }
    }




    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expression = br.readLine().trim();
        System.out.println(Solution.isBalanced(expression));
    }

}
