package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class ConvertSortedArrayToBinarySearchTree_108 {
    public static void main(String[] args) {
        ConvertSortedArrayToBinarySearchTree_108 convertSortedArrayToBinarySearchTree_108 = new ConvertSortedArrayToBinarySearchTree_108();

//        int[] inputArray = new int[]{-10, -3, 0, 5, 9};
        int[] inputArray = new int[]{1, 2, 3, 4, 5, 6, 7};

        TreeNode resultTreeNode = convertSortedArrayToBinarySearchTree_108.sortedArrayToBST(inputArray);

        Queue resultQueue = new LinkedList();
        resultQueue.add(resultTreeNode);
        resultQueue.add(resultTreeNode);

        while (!resultQueue.isEmpty()) {
            TreeNode leftTempTreeNode = (TreeNode) resultQueue.poll();
            TreeNode rightTempTreeNode = (TreeNode) resultQueue.poll();

            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("resultLeftTreeNode: " + leftTempTreeNode.val);
            System.out.println("resultRightTreeNode: " + rightTempTreeNode.val);

            if(leftTempTreeNode.left != null) {
                resultQueue.add(leftTempTreeNode.left);
            }
            if(leftTempTreeNode.right != null) {
                resultQueue.add(leftTempTreeNode.right);
            }
            if(rightTempTreeNode.left != null) {
                resultQueue.add(rightTempTreeNode.left);
            }
            if(rightTempTreeNode.right != null) {
                resultQueue.add(rightTempTreeNode.right);
            }

        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length <= 0) {
            return new TreeNode();
        }

        return getBinarySearchTree(nums, 0, nums.length - 1);
    }

    private TreeNode getBinarySearchTree(int[] nums, int startIndex, int endIndex) {
        if(startIndex > endIndex) {
            return null;
        }
        int middleIndex = (startIndex + endIndex) / 2;
        TreeNode treeNode = new TreeNode(nums[middleIndex]);

        treeNode.left = getBinarySearchTree(nums, startIndex, middleIndex - 1);
        treeNode.right = getBinarySearchTree(nums, middleIndex + 1, endIndex);

        return treeNode;
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
