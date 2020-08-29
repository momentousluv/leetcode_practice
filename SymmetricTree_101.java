package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree_101 {
    public static void main(String[] args) {
        SymmetricTree_101 symmetricTree_101 = new SymmetricTree_101();

        TreeNode treeNode = new TreeNode(1);

        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(2);

        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(4);
        TreeNode treeNode6 = new TreeNode(3);

        treeNode.left = treeNode1;
        treeNode.right = treeNode2;

        treeNode.left.left = treeNode3;
        treeNode.left.right = treeNode4;
        treeNode.right.left = treeNode5;
        treeNode.right.right = treeNode6;

        boolean isSymmetric = symmetricTree_101.isSymmetric(treeNode);
        System.out.println("isSymmetric: " + isSymmetric);
    }

    public boolean isSymmetric(TreeNode root) {
        Queue nodeQueue = new LinkedList();
        nodeQueue.add(root);
        nodeQueue.add(root);

        while(!nodeQueue.isEmpty()) {
            TreeNode leftNode = ((TreeNode) nodeQueue.poll());
            TreeNode rightNode = ((TreeNode) nodeQueue.poll());

            if(leftNode == null && rightNode == null) {
                continue;
            }
            else if(leftNode == null || rightNode == null) {
                return false;
            }
            else if(leftNode.val != rightNode.val) {
                return false;
            }

            nodeQueue.add(leftNode.left);
            nodeQueue.add(rightNode.right);
            nodeQueue.add(leftNode.right);
            nodeQueue.add(rightNode.left);
        }

        return true;
    }

//    public boolean isSymmetric(TreeNode root) {
//        if(root == null) {
//            return true;
//        }
//
//        return isSymmetricTree(root.left, root.right);
//    }
//
//    private boolean isSymmetricTree(TreeNode leftTreeNode, TreeNode rightTreeNode) {
//        if(leftTreeNode == null && rightTreeNode == null) {
//            return true;
//        }
//        else if(leftTreeNode == null || rightTreeNode == null) {
//            return false;
//        }
//        else if(leftTreeNode.val != rightTreeNode.val) {
//            return false;
//        }
//
//        return isSymmetricTree(leftTreeNode.left, rightTreeNode.right) && isSymmetricTree(leftTreeNode.right, rightTreeNode.left);
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
