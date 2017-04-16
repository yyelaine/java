/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param a, b, the root of binary trees.
     * @return true if they are identical, or false.
     */
    public boolean isIdentical(TreeNode a, TreeNode b) {
        // Write your code here
        if(a==null && b==null)
            return true;
        if(a==null || b==null)
            return false;
        if(a.val!=b.val)
            return false;
        boolean left1 = isIdentical(a.left, b.left);
        boolean right1 = isIdentical(a.right, b.right);
        if(left1 && right1)
            return true;
        else
            return false;
    }
}