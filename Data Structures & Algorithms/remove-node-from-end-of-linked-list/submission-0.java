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
        int nodes=0;
        ListNode temp=head;
        while(temp!=null){
            nodes++;
            temp=temp.next;
        }
        if(nodes==n){
            return head.next;
        }
        int stop=nodes-n-1;
        temp=head;
        for(int i=0;i<stop;i++){
            temp=temp.next;

        }
        temp.next=temp.next.next;

        return head;

        }
        

    }

