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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode previous = null;
        ListNode slow = null;
        ListNode fast = head;
        
        int count = 1;
        
        while (fast != null) {
            
            if (count != n) {
                ++count;
            } else if (slow == null) {
                previous = head;
                slow = head;
            } else {
                previous = slow;
                slow = slow.next;
            }
            
            fast = fast.next;
        }
        
        if (previous == slow) {
            head = head.next;
        } else {
            previous.next = slow.next;
        }
        return head;
    }
}