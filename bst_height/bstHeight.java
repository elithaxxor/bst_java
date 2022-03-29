package bst_height;
// To find the max height of a BST, create a recursive function tahat returns the max of the left node / max right node _1


class Node{
    int data;
    Node left;
    Node right; }


public class bstHeight {
    public Node createNewNode(int data) {
        Node a = new Node();
        a.data = data;
        a.left = null;
        a.right = null;
        return a;
    }

    public int getHeight(Node node){
        if (node == null){
            return -1;
        }
        return getMaxVal(getHeight(node.left), getHeight(node.right)) + 1;
    }
    private int getMaxVal(int left, int right){
        return Math.max(left, right);
    }

    public static class runProgram {
        public static void main(String[] args) {
            // Node root = null;
            bstHeight bst = new bstHeight();
            Node root = bst.createNewNode(2);
            root.left = bst.createNewNode(4);
            root.right = bst.createNewNode(4);
            root.left.right = bst.createNewNode(4);
            root.left.left = bst.createNewNode(4);
            root.left.right.left = bst.createNewNode(4);
            root.left.right = bst.createNewNode(4);
        }
    }
}



class Program01 {
    // This is an input class. Do not edit.
    static class BinaryTree {
        private int value;
        public BinaryTree left = null;
        public BinaryTree right = null;
        public BinaryTree(int value) {
            this.value = value;
        }
    }

    static class TreeInfo{
        public boolean isBalanced;
        public int height;

        public TreeInfo(boolean isBalanced, int height){
            this.isBalanced = isBalanced;
            this.height = height;
        }
    }

    public boolean heightBalancedBinaryTree(BinaryTree tree) {
        TreeInfo treeInfo = getTreeInfo(tree);
        return treeInfo.isBalanced;
    }
    public TreeInfo getTreeInfo(BinaryTree node){
        if (node == null){
            return new TreeInfo(true, -1);
        }
        TreeInfo leftSubTreeInfo = getTreeInfo(node.left);
        TreeInfo rightSubTreeInfo = getTreeInfo(node.right);
        boolean isBalanced =
                leftSubTreeInfo.isBalanced
                        && rightSubTreeInfo.isBalanced
                        &&  Math.abs(leftSubTreeInfo.height - rightSubTreeInfo.height) <= 1;

        int height = Math.max(leftSubTreeInfo.height, rightSubTreeInfo.height) + 1;
        return new TreeInfo(isBalanced, height);
    }
}

