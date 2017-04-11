/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode jump2 = head,jump1 = head;
        while(jump2 != null && jump2.next !=null){
            jump2 = jump2.next.next;
            jump1 = jump1.next;
            if(jump2 == jump1) return true;
        }
        return false;
    }
}