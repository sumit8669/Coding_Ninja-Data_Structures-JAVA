package Lecture9_Stack_and_Queues;

class Node{
    int data;
    Node next;

    public Node(int element) {
        this.data = element ;

    }
}
public class StackUsingLL {
    Node head ;
    int size;

    public StackUsingLL() {
        head = null;
        size = 0 ;
    }
    // SIZE , ISEMPTY , TOP ,PUSH , POP
    public int getSize() {
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return (size==0);
    }

    public void push(int element) {
        //Implement the push(element) function
        Node newnode = new Node(element);
        newnode.next=head;
        head=newnode;
        size++;
    }

    public int pop()  {
        //Implement the pop() function
        if(size==0){
            return -1;
        }
        Node temp = head;
        head = head.next;
        size--;
        return temp.data;
    }

    public int top() {
        //Implement the top() function
        if(size==0){
            return -1;
        }
        return head.data;
    }
}

