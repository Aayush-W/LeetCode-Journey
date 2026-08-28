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

    public boolean isSymmetric(TreeNode root) {

        TreeNode mirror = createMirror(root.left);

        return isSameTree(mirror, root.right);
    }

    private TreeNode createMirror(TreeNode root) {

        if (root == null) {
            return null;
        }

        TreeNode node = new TreeNode(root.val);

        node.left = createMirror(root.right);
        node.right = createMirror(root.left);

        return node;
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}