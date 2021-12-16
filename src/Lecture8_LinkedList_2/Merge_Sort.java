package Lecture8_LinkedList_2;

public class Merge_Sort {

    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        if(head1 == null || head2 == null) return head1 != null ? head1 : head2;

        LinkedListNode<Integer> dummy =  new LinkedListNode<Integer>(-1);
        LinkedListNode<Integer> prev = dummy;

        LinkedListNode<Integer> list1 = head1 ;
        LinkedListNode<Integer> list2 = head2 ;

        while (list1 != null && list2 != null)
        {
            if(list1.data  < list2.data){
                prev.next = list1;
                list1 = list1.next;
            }else{
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }
        prev.next = list1 != null ? list1 : list2;
        return dummy.next;

    }

}
