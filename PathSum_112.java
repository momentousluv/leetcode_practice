package leetcode;

public class PathSum_112 {
    public static void main(String[] args) {
        PathSum_112 pathSum_112 = new PathSum_112();

        TreeNode treeNode = new TreeNode(5);
        TreeNode treeNode1 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(8);
        TreeNode treeNode3 = new TreeNode(11);
        TreeNode treeNode4 = new TreeNode(13);
        TreeNode treeNode5 = new TreeNode(4);
        TreeNode treeNode6 = new TreeNode(7);
        TreeNode treeNode7 = new TreeNode(3);
        TreeNode treeNode8 = new TreeNode(1);

        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode.left.left = treeNode3;
        treeNode.right.left = treeNode4;
        treeNode.right.right = treeNode5;
        treeNode.left.left.left = treeNode6;
        treeNode.left.left.right = treeNode7;
        treeNode.right.right.right = treeNode8;

        boolean hasPathSum = pathSum_112.hasPathSum(treeNode, 22);
        System.out.println("hasPathSum: " + hasPathSum);
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) {
            return false;
        }
        if(root.left == null && root.right == null) {
            return sum - root.val == 0;
        }

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
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
