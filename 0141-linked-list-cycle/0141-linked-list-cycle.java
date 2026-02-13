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
        Set<ListNode> num = new HashSet<>();
        while(head != null){
            if(num.contains(head)){
                return true;
               
            }
            else{
                num.add(head);
                 head = head.next;
            }
        }return false;
    }
}