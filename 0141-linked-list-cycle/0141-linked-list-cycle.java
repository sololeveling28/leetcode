/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
//         HashMap<ListNode,Integer> ans = new HashMap<>();
         
//         ListNode newnode = head;
//      while( newnode != null){
//         if(ans.containsKey(newnode)){
// return true;
//         }
//         ans.put(newnode,1);
//         newnode = newnode.next;
//      }
//      return false;
ListNode slow = head;
ListNode fast = head;
while(fast != null && fast.next != null){
    slow = slow.next;
    fast = fast.next.next;
    if(slow == fast){
        return true;
    }
}
return false;
    }
}