class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) return head;

        ListNode temp = head;
        ListNode leftPrev = null;

        // Reach the left-th node
        for (int i = 1; i < left; i++) {
            leftPrev = temp;
            temp = temp.next;
        }

        ListNode leftNode = temp;

        ListNode prev = null;
        ListNode curr = temp;

        // Reverse from left to right
        for (int i = left; i <= right; i++) {
            ListNode next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        // Reconnect left side
        if (leftPrev != null) {
            leftPrev.next = prev;
        } else {
            head = prev;
        }

        // Reconnect right side
        leftNode.next = curr;

        return head;
    }
}