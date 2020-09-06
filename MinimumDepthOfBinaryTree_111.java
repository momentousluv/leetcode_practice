package leetcode;

public class MinimumDepthOfBinaryTree_111 {
    public static void main(String[] args) {
        MinimumDepthOfBinaryTree_111 minimumDepthOfBinaryTree_111 = new MinimumDepthOfBinaryTree_111();

        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
//        TreeNode treeNode1 = new TreeNode(9);
//        TreeNode treeNode2 = new TreeNode(20);
//        TreeNode treeNode3 = new TreeNode(15);
//        TreeNode treeNode4 = new TreeNode(7);

        treeNode.right = treeNode1;
//        treeNode.right = treeNode2;
//        treeNode.right.left = treeNode3;
//        treeNode.right.right = treeNode4;

        int minDepth = minimumDepthOfBinaryTree_111.minDepth(treeNode);
        System.out.println("minDepth: " + minDepth);
    }

    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return getMinDepth(root);
    }

    private int getMinDepth(TreeNode treeNode) {
        if(treeNode == null) {
            return 0;
        }
        int leftMinDepth = getMinDepth(treeNode.left);
        int rightMinDepth = getMinDepth(treeNode.right);

        if(leftMinDepth == 0) {
            return 1 + rightMinDepth;
        }
        else if(rightMinDepth == 0) {
            return 1 + leftMinDepth;
        }

        return 1 + Math.min(leftMinDepth, rightMinDepth);
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
