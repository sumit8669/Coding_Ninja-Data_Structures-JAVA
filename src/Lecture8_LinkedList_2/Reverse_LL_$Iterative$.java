package Lecture8_LinkedList_2;

public class Reverse_LL_$Iterative$ {
    public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> prev = null;
        while (curr != null) {
            LinkedListNode<Integer> temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}