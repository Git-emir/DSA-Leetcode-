/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        pushLeft(root,st1);
        pushRight(root,st2);
        while(!st1.isEmpty() && !st2.isEmpty()){
            TreeNode left = st1.peek();
            TreeNode right = st2.peek();
            if(left == right){
                return false;
            }
            int sum = left.val + right.val;
            if(sum == k) return true;
            else if(sum<k){
                nextSmallest(st1);
            }else{
                nextLargest(st2);
            }
        }return false;
    }
    private void pushLeft(TreeNode node,Stack<TreeNode> st1){
        while(node != null){
            st1.push(node);
            node = node.left;
        }
    }
    private void pushRight(TreeNode node,Stack<TreeNode> st2){
        while(node != null){
            st2.push(node);
            node = node.right;
        }
    }
    private void nextSmallest(Stack<TreeNode> st1){
        TreeNode node = st1.pop();
        if(node.right != null){
            pushLeft(node.right,st1);
        }
    }
    private void nextLargest(Stack<TreeNode> st2){
        TreeNode node = st2.pop();
        if(node.left != null){
            pushRight(node.left,st2);
        }
    }
}