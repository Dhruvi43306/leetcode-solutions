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
        ListNode curunt = head;
        ListNode prev = null;
        ListNode next = head;
        while(curunt != null){
            next = curunt.next;
            curunt.next = prev;
            prev = curunt;
            curunt = next;

        }
        return prev;
    }
}