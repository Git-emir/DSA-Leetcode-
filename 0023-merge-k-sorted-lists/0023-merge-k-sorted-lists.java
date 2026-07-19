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
 class Pair {
    int value;
    ListNode node;

    Pair(int value, ListNode node) {
        this.value = value;
        this.node = node;
    }
}
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.value -   b.value);

        for(int i =0;i<lists.length;i++){
            if(lists[i] != null){
            pq.offer(new Pair(lists[i].val,lists[i]));
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(!pq.isEmpty()){
            Pair p = pq.poll();
             curr.next = p.node;
            if(p.node.next != null){
                pq.offer(new Pair(p.node.next.val,p.node.next));
            }
            curr = curr.next;
        }return dummy.next;
    }
}