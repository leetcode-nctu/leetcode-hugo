/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode newOne = null;
        ListNode tmp = null;
        while(head!=null){
            tmp = newOne;
            newOne = new ListNode(head.val);
            newOne.next = tmp;
            head = head.next;
        }
        return newOne;
    }
}