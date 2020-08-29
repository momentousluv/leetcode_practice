package leetcode;

public class SameTree_100 {
    public static void main(String[] args) {
        SameTree_100 sameTree_100 = new SameTree_100();

        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(1);

        TreeNode treeNode1Left = new TreeNode(2);
        TreeNode treeNode1Right = new TreeNode(3);
        TreeNode treeNode2Left = new TreeNode(2);
        TreeNode treeNode2Right = new TreeNode(3);

        treeNode1.left = treeNode1Left;
        treeNode1.right = treeNode1Right;
        treeNode2.left = treeNode2Left;
        treeNode2.right = treeNode2Right;

        boolean isSameTree = sameTree_100.isSameTree(treeNode1, treeNode2);
        System.out.println("isSameTree: " + isSameTree);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
//        TreeNode tempP = p;
//        TreeNode tempQ = q;
        if(p == null && q == null) {
            return true;
        }
        if((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
//        System.out.println("p.val: " + p.val + ", q.val: " + q.val);

        if(p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) & isSameTree(p.right, q.right);
    }
}

class TreeNode {
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