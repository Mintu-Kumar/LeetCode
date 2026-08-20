package LeetCodeBlind75;

import java.util.List;

public class ReverLinkedList {


 // always run 2 loops in dry run to see the reverse list
    public ListNode reverseList(ListNode head){

        ListNode t1=null,t2=null;
        while (head.next!=null)
        {
           t2= head.next;
           head.next = t1;
           t1 = head;
           head = t2;
        }
        return t1;
    }
}

class ListNode {
    int val;
    ListNode next;
}


