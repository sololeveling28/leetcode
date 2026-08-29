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
    public ListNode reverseList(ListNode head) {
      
       if(head == null || head.next == null){
        return head;
       }
       ListNode pnode = head;
       ListNode cnode = head.next;


       while(cnode != null){
        ListNode nextnode = cnode.next;

        cnode.next = pnode;

        pnode = cnode;
        cnode = nextnode;
       } 
       head.next = null;
       head = pnode;
       return pnode;
    }
}