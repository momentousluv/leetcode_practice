package leetcode;

public class MaximumDepthOfBinaryTree_104 {
    public static void main(String[] args) {
        MaximumDepthOfBinaryTree_104 maximumDepthOfBinaryTree_104 = new MaximumDepthOfBinaryTree_104();

        TreeNode treeNode = new TreeNode(3);
//        TreeNode treeNode1 = new TreeNode(9);
//        TreeNode treeNode2 = new TreeNode(20);
//        TreeNode treeNode3 = new TreeNode(15);
//        TreeNode treeNode4 = new TreeNode(7);
//
//        treeNode.left = treeNode1;
//        treeNode.right = treeNode2;
//        treeNode.right.left = treeNode3;
//        treeNode.right.right = treeNode4;

        int maximumDepth = maximumDepthOfBinaryTree_104.maxDepth(treeNode);
        System.out.println("maximumDepth: " + maximumDepth);
    }

    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftMaxDepth = getMaxDepth(root.left);
        int rightMaxDepth = getMaxDepth(root.right);

        System.out.println("leftMaxDepth: " + leftMaxDepth + ", rightMaxDepth: " + rightMaxDepth);

        return Math.max(leftMaxDepth, rightMaxDepth) + 1;
    }

    private int getMaxDepth(TreeNode treeNode) {
        if(treeNode == null) {
            return 0;
        }
        else if(treeNode.left == null && treeNode.right == null) {
            return 1;
        }
        else if(treeNode.left == null) {
            return getMaxDepth(treeNode.right) + 1;
        }
        else if(treeNode.right == null) {
            return getMaxDepth(treeNode.left) + 1;
        }

        return Math.max(getMaxDepth(treeNode.left) + 1, getMaxDepth(treeNode.right) + 1);
    }

//    private int getMaxDepth(TreeNode leftNode, TreeNode rightNode) {
//        if(leftNode == null && rightNode == null) {
//            return 1;
//        }
//
//        return Math.max(getMaxDepth(leftNode.left, leftNode.right) + 1, getMaxDepth(rightNode.left, rightNode.right) + 1);
//    }

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
