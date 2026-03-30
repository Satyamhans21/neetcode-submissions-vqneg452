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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
if (list2 == null) return list1;
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode head=new ListNode();
        if(list1.val<=list2.val){
            head=list1;
            temp1=temp1.next;
        }
        else{
             head=list2;
             temp2=temp2.next;
        }
        ListNode current=head;

        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                current.next=temp1;
                temp1=temp1.next;
            }
            else{
                current.next=temp2;
                temp2=temp2.next;
            }
            current=current.next;

        }
        if(temp1!=null){
            current.next=temp1;
            

        }
        else{
            current.next=temp2;
            

        }
        return head;
        

        
    }
}