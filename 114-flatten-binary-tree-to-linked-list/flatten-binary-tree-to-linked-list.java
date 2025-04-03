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
    public void flatten(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        preOrderTraversal(root, queue);

        TreeNode prevNode = queue.poll();
        while (!queue.isEmpty()) {
            prevNode.left = null;
            TreeNode nextNode = queue.poll();
            prevNode.right = nextNode;
            prevNode = nextNode;
        }
    }
    
    public void preOrderTraversal(TreeNode root, Queue<TreeNode> queue) {
        if (root == null) {
            return;
        }
        queue.add(root);
        preOrderTraversal(root.left, queue);
        preOrderTraversal(root.right, queue);
    }
}