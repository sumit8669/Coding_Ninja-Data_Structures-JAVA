package Test2;
class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}
public class Next_Number {
    public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head)
    {

        if(head== null)
            return head;

        LinkedListNode<Integer> current=head;
        LinkedListNode<Integer> prev=null;
        int length=0;
        LinkedListNode<Integer> last=current;
        while(current!=null)
        {
            length++;
            if(current.data!=9)
                prev=current;

            last=current;
            current=current.next;
        }// Now last is pointing to last digit.
        //  Prev is pointing to last non 9.
        if(prev==null)
        {
            //case when number is all 9
            LinkedListNode<Integer> newhead=new LinkedListNode<Integer>(1);
            newhead.next=head;

            while(head!=null)
            {
                head.data=0;
                head=head.next;
            }
            return newhead;
        }else
        {
            prev.data=prev.data+1;
            prev=prev.next;
            while(prev!=null)
            {
                prev.data=0;
                prev=prev.next;
            }
            return head;

        }
    }
}
