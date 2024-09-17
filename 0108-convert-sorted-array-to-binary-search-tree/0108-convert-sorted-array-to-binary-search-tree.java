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
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildTree(int[] nums, int left, int right) {
        if (left > right) {
            return null; // Base case: no elements to form a tree
        }

        int mid = left + (right - left) / 2; // Find the middle index
        TreeNode node = new TreeNode(nums[mid]); // Create a new tree node with the middle element

        // Recursively build the left and right subtrees
        node.left = buildTree(nums, left, mid - 1);
        node.right = buildTree(nums, mid + 1, right);

        return node; // Return the constructed subtree
    }
}
