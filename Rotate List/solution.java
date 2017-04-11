/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k <= 0)
        return head;
        
        ListNode tempNode = head;
        int count = 1;
        while(tempNode.next != null){
            count++;
            tempNode = tempNode.next;
        }
        tempNode.next = head;
        tempNode = head;
        for(int i = 0;i< count-(k%count)-1;i++)
            tempNode = tempNode.next;
        
        head = tempNode.next;
        tempNode.next = null;
        return head;
    }
}