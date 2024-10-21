class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        //Edge cases
        if(head==null||head.next==null||k==0)
        {
            return head;
        }
        else{
            ListNode temp=head;
            int len=1;
            while(temp.next!=null){
                len+=1;
                temp=temp.next;
            }
            temp.next=head;
            k=k%len;
            k=len-k;
            while(k>=1){
                temp=temp.next;
                k-=1;
            }
            head=temp.next;
            temp.next=null;
            return head;
        }
    }
}
