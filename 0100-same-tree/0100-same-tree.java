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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();

        queue1.offer(p);
        queue2.offer(q);

        while (!queue1.isEmpty() && !queue2.isEmpty()) {

            TreeNode a = queue1.poll();
            TreeNode b = queue2.poll();

            if (a == null && b == null) {
                continue;
            }

            if (a == null || b == null) {
                return false;
            }

            if (a.val != b.val) {
                return false;
            }

            queue1.offer(a.left);
            queue1.offer(a.right);

            queue2.offer(b.left);
            queue2.offer(b.right);
        }

        return true;
    }
}