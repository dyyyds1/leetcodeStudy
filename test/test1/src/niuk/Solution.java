package niuk;

public class Solution {
    //bm1
    public ListNode ReverseList(ListNode head) {
        if (head==null){
            return null;
        }

        ListNode tmp=head.next;
        head.next=null;
        ListNode cur;
        while (tmp!=null){
            cur=tmp.next;
            tmp.next=head;
            head=tmp;
            tmp=cur;
        }
        return head;
    }//bm2
    public ListNode reverseBetween (ListNode head, int m, int n) {
        // write code here
        if (head==null){
            return null;
        }
        if (head.next==null){
            return head;
        }
        if (m==n){
            return head;
        }
        ListNode front=null,rear=null,cur=head,fTmp=null;

        for (int i = 1; i <= n; i++) {
            if (i==m-1){
                fTmp=cur;
            }
            if (i==m){
                front=cur;
            }
            if (i==n){
                rear=cur;
            }
            cur=cur.next;
        }
        if (fTmp!=null) {
            fTmp.next = null;
        }
        ListNode rTmp=rear.next;
        rear.next=null;
        ListNode tmp=front.next,tpp=null;
        front.next=null;
        while (tmp!=null){
            tpp=tmp.next;
            tmp.next=front;
            front=tmp;
            tmp=tpp;
        }
        fTmp.next=front;
        cur=head;
        while (cur.next!=null){
            cur=cur.next;
        }
        cur.next=rTmp;
        return head;
    }
}
