/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = 0;
        int sizeB = 0;

        ListNode temp = headA;
        ListNode temp2 = headB;

        int counterA = 0;
        int counterB = 0;

        ListNode turtle = headA;
        ListNode rabbit = headA;

        while(rabbit != null && rabbit.next != null){
            turtle = turtle.next;
            rabbit = rabbit.next.next;

            counterA++;
        }

        if(rabbit == null){
            sizeA = counterA * 2;
        }else{
            sizeA = counterA * 2 + 1;
        }


        ListNode turtleB = headB;
        ListNode rabbitB = headB;

        while(rabbitB != null && rabbitB.next != null){
            turtleB = turtleB.next;
            rabbitB = rabbitB.next.next;

            counterB++;
        }

        if(rabbitB == null){
            sizeB = counterB * 2;
        }else{
            sizeB = counterB * 2 + 1;
        }


        ListNode h1 = headA;
        ListNode h2 = headB;
        
        int difference = sizeA - sizeB;
        if(difference == 0){

        }
        else if(difference < 0){
            for(int i = 0 ; i <Math.abs(difference) ; i++){
                h2 = h2.next;
            }
        }else{
            for(int i = 0 ; i <Math.abs(difference) ; i++){
                h1 = h1.next;
            }
        }

        while(h1 != null){
            if(h1 == h2){
                return h1;
            }
            h1 = h1.next;
            h2 = h2.next;
        }

        return null;
    }
}