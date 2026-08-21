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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || postorder == null || inorder.length != postorder.length) return null;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        return buildPostIn(inorder,0,inorder.length-1,postorder,0,postorder.length-1,hm);

    }

    private TreeNode buildPostIn(int[] inorder,int is,int ie,int[] postorder,int ps,int pe,HashMap<Integer,Integer> hm ){
        if(is>ie || ps > pe) return null;

        TreeNode root = new TreeNode(postorder[pe]);
        int inroot = hm.get(postorder[pe]);
        int numsleft = inroot - is;
        root.left = buildPostIn(inorder,is,inroot-1,postorder,ps,ps+numsleft-1,hm);
        root.right = buildPostIn(inorder,inroot+1,ie,postorder,ps+numsleft,pe-1,hm);
        return root;
    }
}