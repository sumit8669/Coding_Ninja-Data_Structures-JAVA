package Lecture8_LinkedList_2;

public class MidPoint_Of_LinkedList {

    //LOGIC FOR MID OF LINKEDLIST

    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head)
    {
        LinkedListNode<Integer> slow = head , fast = head;
        while(fast != null && fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


}
