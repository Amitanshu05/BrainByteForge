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
    public boolean isPalindrome(ListNode head) {
        // finding mid value : using slow fast pointer :

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null &&  fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast != null){
            slow = slow.next;
        }

        ListNode mid = slow;

        ListNode prev = null;
        ListNode curr = mid;
        ListNode next = null;


        while(curr != null){
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        ListNode tail = prev;


        ListNode start = head;

        while(tail != null){
            if(start.val != tail.val){
                return false;
            }

            start = start.next;
            tail = tail.next;
        }

        return true;
    }
}