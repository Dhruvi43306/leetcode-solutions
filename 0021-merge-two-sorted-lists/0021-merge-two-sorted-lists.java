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
    ListNode dummy = new ListNode(0);
    ListNode currunt = dummy;
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                currunt.next = list1;
                list1 = list1.next;
            }
            else{
                currunt.next = list2;
                list2 = list2.next;
            }
            currunt = currunt.next;
        }
         if(list1 != null){
            currunt.next = list1;
        }
        else{
            currunt.next = list2;
        }
    return dummy.next;
        
    }
}