package Test2;

class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.setData(data);
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
public class Delete_Alternate_Nodes {

    public static void deleteAlternateNodes(Node<Integer> head)
    {
        Node<Integer> prev = head;
        Node<Integer> now = head.next;
        int count=0;
        if(head==null)
        {
            return;
        }
        while(prev!=null && now!=null)
        {
            prev.next=now.next;
            now=null;
            prev=prev.next;
            if(prev!=null){
                now=prev.next;
            }
        }
    }
}
