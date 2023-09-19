package nkTop100;

import java.util.ArrayList;
import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class bm5 {
    public ListNode mergeKLists (ArrayList<ListNode> lists) {
        // write code here
        PriorityQueue<ListNode> heap=new PriorityQueue<>((v1, v2) -> v1.val-v2.val);
        for (ListNode head:lists){
            if (head!=null){
                heap.offer(head);
            }
        }

        ListNode ret=new ListNode(0);
        ListNode pre=ret;
        while (!heap.isEmpty()){
            ListNode t=heap.poll();
            pre.next=t;
            pre=pre.next;
            if (t.next!=null) heap.offer(t.next);
        }

        return ret.next;
    }
}
