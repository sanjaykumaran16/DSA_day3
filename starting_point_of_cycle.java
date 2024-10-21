public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        else{
            ListNode slow=head;
            ListNode fast=head;
            ListNode entry=head;
            while(fast.next!=null&&fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    while(entry!=slow){
                        entry=entry.next;
                        slow=slow.next;
                    }
                    return slow;
                }
            }

        }
        return null;
        
    }
}
