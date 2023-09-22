package nkTop100;

public class bm10 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null||pHead2==null) return null;
        ListNode cur1=pHead1,cur2=pHead2;
        int len1=0,len2=0;
        while(cur1!=null){
            cur1=cur1.next;
            len1++;
        }
        while(cur2!=null){
            cur2=cur2.next;
            len2++;
        }
        int n=len1-len2;
        if(len1<len2) {
            n=-n;
            cur1=pHead2;
            cur2=pHead1;
        }else{
            cur1=pHead1;
            cur2=pHead2;
        }
        while(n>0){
            cur1=cur1.next;
            n--;
        }
        while(cur1!=null&&cur2!=null){
            if(cur1==cur2) return cur1;
            cur1=cur1.next;
            cur2=cur2.next;
        }

        return null;
    }
}
