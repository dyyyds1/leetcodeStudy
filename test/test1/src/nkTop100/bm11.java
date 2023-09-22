package nkTop100;


public class bm11 {
    public ListNode addInList (ListNode head1, ListNode head2) {
        if (head1==null) return head2;
        if (head2==null) return head1;
        //翻转12
        head1=reverse(head1);
        head2=reverse(head2);
        int tmp=0;
        ListNode newhead=new ListNode(-1);
        ListNode cur=newhead;
        while (head1!=null||head2!=null){
            int val=tmp;
            if (head1!=null){
                val+=head1.val;
                head1=head1.next;
            }
            if (head2!=null){
                val+=head2.val;
                head2=head2.next;
            }
            tmp=val/10;
            cur.next=new ListNode(val%10);
            cur=cur.next;
        }
        if (tmp!=0){
            cur.next=new ListNode(tmp);
        }
        return reverse(newhead.next);
    }

    public ListNode reverse(ListNode head){
        if (head==null) return null;
        ListNode cur=head;
        ListNode tmp=null;
        while (cur!=null){
            ListNode tail=cur.next;
            cur.next=tmp;
            tmp=cur;
            cur=tail;
        }
        return tmp;
    }


}
