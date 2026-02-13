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
        // Set<ListNode> num = new HashSet<>();
        // while(head != null){
        //     if(num.contains(head)){
        //         return true;
               
        //     }
        //     else{
        //         num.add(head);
        //          head = head.next;
        //     }
        // }return false;

        //optimal using slow and fast pointers

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }return false;
    }
}