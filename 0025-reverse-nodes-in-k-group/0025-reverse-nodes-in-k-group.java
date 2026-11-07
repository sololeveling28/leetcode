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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode h = new ListNode(-1);
        h.next = head;
        ListNode pre = h;

        while (true) {
            ListNode nth = pre;

            for (int i = 0; i < k; i++) {
                nth = nth.next;
                if (nth == null) {
                    return h.next;
                }
            }

            ListNode gn = nth.next;
            ListNode cur = pre.next;
            ListNode pn = gn;

            while (cur != gn) {
                ListNode temp = cur.next;
                cur.next = pn;
                pn = cur;
                cur = temp;
            }

            ListNode tmp = pre.next;
            pre.next = nth;
            pre = tmp;
        }
    }
}
