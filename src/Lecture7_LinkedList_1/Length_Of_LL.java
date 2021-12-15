package Lecture7_LinkedList_1;

public class Length_Of_LL {

    public static int length(LinkedListNode<Integer> head){
        int size =0;
        while(head != null){
            head = head.next;
            size++;
        }
        return size;
    }

}
class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public void Node(T data) {
        this.data = data;
    }
}
