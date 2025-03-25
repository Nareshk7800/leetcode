/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
        return null;
        ListNode h=head;
        while(h!=null&&h.next!=null){
            if(h.val==h.next.val)
            {
                h.next=h.next.next;
            }
            else{
                h=h.next;
            }
        }
        return head;
    }
}