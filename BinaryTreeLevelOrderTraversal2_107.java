package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal2_107 {
    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal2_107 binaryTreeLevelOrderTraversal2_107 = new BinaryTreeLevelOrderTraversal2_107();

        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(9);
        TreeNode treeNode2 = new TreeNode(20);
        TreeNode treeNode3 = new TreeNode(15);
        TreeNode treeNode4 = new TreeNode(7);

        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode.right.left = treeNode3;
        treeNode.right.right = treeNode4;

        List<List<Integer>> treeList = binaryTreeLevelOrderTraversal2_107.levelOrderBottom(treeNode);

        for(int i=0; i < treeList.size(); i++) {
            for(int j=0; j < treeList.get(i).size(); j++) {
                System.out.println("treeList: " + treeList.get(i).get(j));
            }
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> tempList = new ArrayList<>();
        if(root == null) {
            return tempList;
        }

        Queue treeQueue = new LinkedList();
        Queue subTreeQueue = new LinkedList();
        treeQueue.add(root);

        while(!treeQueue.isEmpty()) {
            TreeNode tempTreeNode = (TreeNode) treeQueue.poll();
            subTreeQueue.add(tempTreeNode);
            List<Integer> subIntegerArray = new ArrayList<>();

            if(treeQueue.isEmpty()) {
                while(!subTreeQueue.isEmpty()) {
                    TreeNode subTreeNode = (TreeNode) subTreeQueue.poll();
                    subIntegerArray.add(subTreeNode.val);

                    if(subTreeNode.left != null) {
                        treeQueue.add(subTreeNode.left);
                    }
                    if(subTreeNode.right != null) {
                        treeQueue.add(subTreeNode.right);
                    }
                }
            }
//            printSubArray(subIntegerArray);
            if(subIntegerArray.size() > 0) {
                tempList.add(0, subIntegerArray);
            }
        }

        return tempList;
    }

    private void printSubArray(List<Integer> subArray) {
        for(int i=0; i < subArray.size(); i++) {
            System.out.println("subArrayInPrintSubArray: " + subArray.get(i));
        }
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
