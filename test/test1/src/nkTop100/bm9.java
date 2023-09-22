package nkTop100;

public class bm9 {
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        if(head==null) return null;
        if(head.next==null) return null;
        ListNode fast=head,slow=head,pre=head;
        while(n>0){
            n--;
            fast=fast.next;
        }
        if(fast==null) return head.next;
        while(fast!=null){
            fast=fast.next;
            pre=slow;
            slow=slow.next;
        }
        pre.next=slow.next;
        return head;
    }
}
