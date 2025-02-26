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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        int n = 1;
        while(!que.isEmpty()){
            int t = 0;
            ArrayList<Integer> li = new ArrayList<>();
            for(int i = 0; i < n && !que.isEmpty(); i++){
                TreeNode curr = que.poll();
                li.add(curr.val);
                if(curr.left != null) {
                    que.add(curr.left);
                    t++;
                }
                if(curr.right != null) {
                    que.add(curr.right);
                    t++;
                }
            }
            System.out.println(li);
            n = t;
            list.add(li);
        }

        return list;
    }
}