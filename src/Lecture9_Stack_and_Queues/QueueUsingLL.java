package Lecture9_Stack_and_Queues;


public class QueueUsingLL {

    private Node front;
    private Node rear;
    private int size;

    public QueueUsingLL() {
        front = null;
        rear = null;
        size = 0;
    }
    int size(){
        return size;
    }

    boolean isEmpty(){
        return size == 0;
    }

    int front() {
        if(size == 0){
            return -1;
        }
        return front.data;
    }

    void enqueue(int element){
        Node newNode = new Node(element);
        if(rear == null){
            front = newNode;
        }else{
            rear.next = newNode;
        }
        rear = newNode;
        size++;

    }

    int dequeue() {
        if(size == 0){
            return -1;
        }

        int temp = front.data;
        front = front.next;
        if(size == 1){
            rear = null;
        }
        size--;

        return temp;
    }


}
