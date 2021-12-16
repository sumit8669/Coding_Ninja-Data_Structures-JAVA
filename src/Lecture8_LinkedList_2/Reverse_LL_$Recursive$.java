package Lecture8_LinkedList_2;

public class Reverse_LL_$Recursive$ {

    // RECURSIVE METHOD TO REVERSE A LINKEDLIST

    public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
        if(head == null || head.next == null) return head;
        LinkedListNode<Integer> finalHead = reverseLinkedListRec(head.next);
        head.next.next =head;
        head.next = null;

        return finalHead;
    }
}
