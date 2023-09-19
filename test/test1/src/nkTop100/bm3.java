package nkTop100;


public class bm3 {
    public ListNode reverseKGroup (ListNode head, int k) {
        // write code here
        int n=0;
        ListNode cur=head;
        while (cur!=null){
            cur=cur.next;
            n++;
        }
        n/=k;
        ListNode newhead=new ListNode(0);
        ListNode pre=newhead;
        cur=head;
        for (int i = 0; i < n; i++) {
            ListNode tmp=cur;
            for (int j = 0; j < k; j++) {
                //头插
                ListNode next=cur.next;
                cur.next=pre.next;
                pre.next=cur;
                cur=next;
            }
            pre=tmp;
        }
        pre.next=cur;
        return newhead.next;
    }
}
