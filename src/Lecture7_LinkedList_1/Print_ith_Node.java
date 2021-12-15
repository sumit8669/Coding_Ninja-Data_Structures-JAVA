package Lecture7_LinkedList_1;

public class Print_ith_Node {
    //Use this logic to solve the solution method may different

    public static void printIthNode(LinkedListNode<Integer> head, int i){
        for(int j=0;j<=i && head!= null;j++)
        {	if(j==i)
            System.out.println(head.data);
            head=head.next;
        }
    }
}
