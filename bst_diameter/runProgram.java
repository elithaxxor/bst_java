package bst_diameter;
// diamter is the maximium distance between any two leaf nodes.
// check max # of nodes on right and left half.
// [LOGIC] --> start diamater at 0, recurivly start at root (left then right)
// if bottom leaf (leafe node) then return 1,
// diamater = Math.max(left, right)+1



class Node{
    int data;
    Node left;
    Node right;
}

class bst_diamater {
     private int diamater = 0;

     public Node createNode(int data) {
         Node a = new Node();
         a.data = data;
         a.left = null;
         a.right = null;
         return a;
     }

     public int getDiamater() {
         return diamater;
     }

     public void setDiamater(int diamater) {
         this.diamater = diamater;
     }

     public int findDiamater(Node node) {
         if (node == null){
             return 0;
         }
         if (node.left == null && node.right == null) { // CHECKS LEAF NODE
             return 1;
         }

         // calculates the height
         int left = findDiamater(node.left);
         int right = findDiamater(node.right);

         // calculates the diamater
         diamater = Math.max(diamater, left + right +1);
         return Math.max(left, right)+1;
     }
 }

public class runProgram {
    public static void main(String[] args) {
        // Node root = null;
        bst_diamater d = new bst_diamater();
        Node root = d.createNode(1);

        root.left = d.createNode(41);
        root.right = d.createNode(32);
        root.left.right = d.createNode(45);
        root.left.left = d.createNode(4);
        root.left.right.left = d.createNode(33);
        root.left.right = d.createNode(46);
        int result = d.findDiamater(root);
        System.out.println("Diameter" + result);

    }
}

class Program {
    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
    static class TreeInfo{
        public int diamater;
        public int height;
        public TreeInfo(int diamater, int height){
            this.diamater = diamater;
            this.height = height;
        }
    }

    public int binaryTreeDiameter(BinaryTree tree) {
        return getTreeInfo(tree).diamater;
    }

    public TreeInfo getTreeInfo(BinaryTree tree){
        if (tree == null){
            return new TreeInfo(0,0);
        }
        TreeInfo leftTreeInfo = getTreeInfo(tree.left);
        TreeInfo rightTreeInfo = getTreeInfo(tree.right);

        int longestPathThroughRoot = leftTreeInfo.height + rightTreeInfo.height;
        int maxDiamaterSoFar = Math.max(leftTreeInfo.diamater, rightTreeInfo.diamater);
        int currentDiamater = Math.max(longestPathThroughRoot, maxDiamaterSoFar);
        int currentHeight = 1 + Math.max(leftTreeInfo.height, rightTreeInfo.height);

        return new TreeInfo(currentDiamater, currentHeight);

    }
}

