/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root == null)
            return ans;
        String s = "";
        s += root.val;
        if (root.left == null && root.right == null)
            ans.add(s);
        if (root.left != null) {
            cal(root.left, ans, s);
        }
        if (root.right != null) {
            cal(root.right, ans, s);
        }
        return ans;

    }

    private void cal(TreeNode node, List<String> ans, String path) {
        path = path + "->" + node.val;
        if (node.left == null && node.right == null) {
            ans.add(path);
        }
        if (node.left != null) {
            cal(node.left, ans, path);
        }
        if (node.right != null) {
            cal(node.right, ans, path);
        }
    }

}