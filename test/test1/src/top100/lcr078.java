package top100;

import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class lcr078 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap=new PriorityQueue<>((v1,v2) -> v1.val- v2.val);
        for (int i = 0; i < lists.length; i++) {
            if (lists[i]!=null) heap.offer(lists[i]);
        }

        ListNode ret=new ListNode(0);
        ListNode pre=ret;
        while (!heap.isEmpty()){
            ListNode t=heap.poll();
            pre.next=t;
            pre= pre.next;
            if (t.next!=null) heap.offer(t.next);
        }

        return ret.next;
    }
}
