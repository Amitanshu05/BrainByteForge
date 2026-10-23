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
        if(head == null || head.next == null) return true;


        // finding mid so that next element se reverse kardenge linked list .


        ListNode turtle = head;
        ListNode hare = head;

        while(hare != null && hare.next != null){

            turtle = turtle.next;
            hare = hare.next.next;
        }

        if(hare != null){
            turtle = turtle.next;
        }
        
        ListNode curr = turtle;

        ListNode prev = null;

        ListNode next = curr.next;

        while(curr != null){

            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        ListNode temp = head;
        ListNode revTemp = prev;

        while(revTemp != null){
            if(temp.val != revTemp.val){
                return false;
            }

            temp = temp.next;
            revTemp = revTemp.next;
        }

        return true;
    }
}