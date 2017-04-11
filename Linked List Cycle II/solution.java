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
    public ListNode detectCycle(ListNode head) {
        if(head == null||head.next == null) return null;
        ListNode jump2 = head,jump1 = head;
        while(jump2 != null && jump2.next != null){
            jump2 = jump2.next.next;
            jump1 = jump1.next;
            if(jump2 == jump1) break;
        }
        if(jump2 == null || jump2.next == null) return null;
        jump1 = head;
        while(jump2 !=  jump1) {

            jump2 = jump2.next;
            jump1 = jump1.next;
        }
        return jump1;
    }
}