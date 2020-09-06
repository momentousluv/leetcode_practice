package leetcode;

public class BalancedBinaryTree_110 {
    public static void main(String[] args) {
        BalancedBinaryTree_110 balancedBinaryTree_110 = new BalancedBinaryTree_110();

        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(9);
        TreeNode treeNode2 = new TreeNode(20);
        TreeNode treeNode3 = new TreeNode(15);
        TreeNode treeNode4 = new TreeNode(7);

        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode.right.left = treeNode3;
        treeNode.right.right = treeNode4;

        boolean isBalancedBinaryTree = balancedBinaryTree_110.isBalanced(treeNode);
        System.out.println("isBalancedBinaryTree: " + isBalancedBinaryTree);
    }

    boolean isBalancedTree = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        getTreeDepth(root);

        return isBalancedTree;
    }

    private int getTreeDepth(TreeNode treeNode) {
        if(treeNode == null) {
            return 0;
        }
        int leftDepth = getTreeDepth(treeNode.left);
        int rightDepth = getTreeDepth(treeNode.right);

        if(Math.abs(leftDepth - rightDepth) > 1) {
            isBalancedTree = false;
        }

        return 1 + Math.max(leftDepth, rightDepth);
    }

    static class TreeNode {
        int val;

        TreeNode left;

        TreeNode right;

        TreeNode() {

        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
