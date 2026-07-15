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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) return head;
        ListNode tail = head;
        int cnt = 1;
        while(tail.next != null){
            cnt++;
            tail = tail.next;

        }
        k = k % cnt;
        if(k == 0) return head;
        tail.next = head;
        ListNode lNode = nthNode(head,cnt-k);
        head = lNode.next;
        lNode.next = null;

       return head;
    }

    private ListNode nthNode(ListNode head,int k){
        int cnt = 1;
        ListNode temp = head;
        while(temp != null){
            if(cnt == k) return temp;
            cnt++;
            temp = temp.next;
        }return temp;
    }
}