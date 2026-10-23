public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = 0, sizeB = 0;

        ListNode tempA = headA;
        ListNode tempB = headB;

        while (tempA != null) {
            sizeA++;
            tempA = tempA.next;
        }

        while (tempB != null) {
            sizeB++;
            tempB = tempB.next;
        }

        tempA = headA;
        tempB = headB;

        int diff = Math.abs(sizeA - sizeB);

        if (sizeA > sizeB) {
            for (int i = 0; i < diff; i++) {
                tempA = tempA.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                tempB = tempB.next;
            }
        }

        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return tempA;
    }
}