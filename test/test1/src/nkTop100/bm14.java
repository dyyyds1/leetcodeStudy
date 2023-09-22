package nkTop100;

public class bm14 {
    public ListNode oddEvenList (ListNode head) {
        // write code here
        if (head==null) return null;
        ListNode evenHead=head.next;
        ListNode old=head,even=evenHead;
        while (even!=null&&even.next!=null){
            old.next=even.next;
            old=old.next;
            even.next=old.next;
            even=even.next;
        }
        old.next=evenHead;
        return head;

    }
}
