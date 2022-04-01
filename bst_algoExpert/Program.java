//package bst_algoExpert;
//import isBST.BST;
//
//import java.util.*;
//
//class Program {
//    public static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
//        if (tree.left != null){
//            inOrderTraverse(tree.left, array);
//        }
//        array.add(tree.value);
//        if (tree.right != null){
//            inOrderTraverse(tree.right, array);
//        }
//        return array;
//    }
//
//    public BST preOrderTraverse(BST tree, List<Integer> array) {
//        array.add(tree.value);
//        if (tree.left != null){
//            preOrderTraverse(tree.left, array);
//        }
//        if (tree.right != null){
//            preOrderTraverse(tree.right, array);
//        }
//        return array;
//    }
//
//    public static List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
//        if (tree.left != null){
//            postOrderTraverse(tree.left, array);
//        }
//        if (tree.right != null){
//            postOrderTraverse(tree.right, array);
//        }
//        array.add(tree.value);
//        return array;
//    }
//
//    public int insert(BST tree, int value) {
//        if (tree.value < this.value) {
//            if (tree.left == null) {
//                BST newBST = new BST(value);
//                tree.left = newBST;
//            } else {
//                tree.left.insert(value);
//            }
//        } else {
//            if (tree.right == null) {
//                BST newBST = new BST(value);
//                tree.right = newBST;
//            } else {
//                tree.right.insert(value);
//            }
//        }
//        return value;
//    }
//
//    public boolean contains(BST tree, int value) {
//        if (value < this.value) {
//            if (left == null) {
//                return false;
//            } else {
//                return left.contains(value);
//            }
//        } else if (value > this.value) {
//            if (right == null) {
//                return false;
//            } else {
//                return right.contains(value);
//            }
//        } else {
//            return true;
//        }
//    }
//
//
//    public BST remove(int value) {
//        remove(value, null);
//        return this;
//    }
//
//    public void remove(int value, BST parent) {
//        if (value < this.value) {
//            if (left != null) {
//                left.remove(value, this);
//            }
//        } else if (value > this.value){
//            if (right != null) {
//                right.remove(value, this);
//            }
//        } else {
//            if (left != null && right != null){
//                this.value = right.getMinValue();
//                right.remove(this.value, this);
//            }
//            else if (parent == null){
//                if( left != null){
//                    this.value = left.value;
//                    right = left.right;
//                    left = left.left;
//                }
//            }else if (parent.left == this){
//                parent.left = left != null ? left : right;
//            }else if (parent.right == this){
//                parent.right = left != null ? left : right;
//            }
//        }}
//    public int getMinValue(){
//        if (left == null){
//            return this.value;
//        }else {
//            return left.getMinValue();
//        }
//    }
//
//    public static BST minHeightBst(List<Integer> array) {
//        // Write your code here.
//        return constructMinHeightBst(array, null, 0, array.size()-1);
//    }
//
//    public static BST constructMinHeightBst(List<Integer> array, BST bst, int startIdx, int endIdx)
//    {
//        if (endIdx < startIdx) return null;
//
//        int midIdx = (startIdx + endIdx) / 2;
//        int valueToAdd = array.get(midIdx);
//
//
//        if (bst==null){
//            bst = new BST(valueToAdd);
//        } else{
//            bst.insert(valueToAdd);
//        }
//        constructMinHeightBst(array, bst, startIdx, midIdx - 1);
//        constructMinHeightBst(array, bst, midIdx +1, endIdx);
//        return bst;
//    }
//
//    static class BST {
//        public int value;
//        public BST left;
//        public BST right;
//
//        public BST(int value) {
//            this.value = value;
//            left = null;
//            right = null;
//        }
//
//        public void insert(int value) {
//            if (value < this.value) {
//                if (left == null) {
//                    left = new BST(value);
//                } else {
//                    left.insert(value);
//                }
//            } else {
//                if (right == null) {
//                    right = new BST(value);
//                } else {
//                    right.insert(value);
//                }
//            }
//        }
//    }
//}
//
////
////
////
////    // This is an input class. Do not edit.
////    static class BST {
////        public int value;
////        public BST left = null;
////        public BST right = null;
////
////        public BST(int value) {
////            this.value = value;
////        }
////
////    public BST reconstructBst(ArrayList<Integer> preOrderTraversalValues) {
////        if (preOrderTraversalValues.size() == 0) {
////            ;
////            {
////                return null;
////            }
////        }
////        int currentValue = preOrderTraversalValues.get(0);
////        int rightSubTreeRootIdx = preOrderTraversalValues.size();
////
////        for (int idx = 1; idx < preOrderTraversalValues.size(); idx++) {
////            int value = preOrderTraversalValues.get(idx);
////            if (value >= currentValue) {
////                rightSubTreeIdx = idx;
////                break;
////            }
////        }
////        BST leftSubTree = reconstructBst(preOrderTraversalValue.subList(1, rightSubTreeRoot));
////        BST rightSubTree = reconstructBst(preOrderTraversalValues.subList(rightSubTreeRootIDX, preOrderTraversalValues.size()));
////
////        BST bst = new BST(currentValue) {
////            bst.left = leftSubTree;
////            bst.right = rightSubTree;
////             return bst;
////
////        }
////    }
//
//
//
//
//
//
//public static class BST01 {
//        public int value;
//        public  BST01 left;
//        public BST01 right;
//        public int BST00(int value) {
//            this.tree = tree;
//            return value;
//        }
//    }
//
//        static class BST {
//            public int value;
//            public BST left = null;
//            public BST right = null;
//
//            public BST(int value) {
//                this.value = value;
//            }
//
//            public BST reconstructBst(ArrayList<Integer> preOrderTraversalValues) {
//                if (preOrderTraversalValues.size() == 0) {
//                    return null;
//
//                }
//
//                class Program {
//                    // This is an input class. Do not edit.
//                    static class BST {
//                        public int value;
//                        public BST left = null;
//                        public BST right = null;
//
//                        public BST(int value) {
//                            this.value = value;
//                        }
//                    }
//
//                    public BST reconstructBst(ArrayList<Integer> preOrderTraversalValues) {
//                        if (preOrderTraversalValues.size() == 0) {
//                            return null;
//                        }
//
//                        int currentValue = preOrderTraversalValues.get(0);
//                        int rightSubTreeRootIdx = preOrderTraversalValues.size();
//
//                        for (int idx = 1; idx < preOrderTraversalValues.size(); idx++) {
//                            int value = preOrderTraversalValues.get(idx);
//                            if (value >= currentValue) {
//                                rightSubTreeRootIdx = idx;
//                                break;
//                            }
//                        }
//                        BST leftSubTree = reconstructBst(preOrderTraversalValues.subList(1, rightSubTreeRootIdx));
//                        BST rightSubTree =
//                                reconstructBst(preOrderTraversalValues.subList(rightSubTreeRootIdx, preOrderTraversalValues.size()));
//
//                        BST bst = new BST(currentValue) {
//                            bst.left = leftSubTree;
//                            bst.right = rightSubTree;
//             return bst;
//                        }
//                    }
//
//                    public Node mirrorTree{
//
//                }
//
//
///// siwth the left and right node
//
//
//    public static void main(String[] args){
//        BST01 root = null;
//        BST01 prev = null;
//        BST01 a = new BST01();
//        int val0 = 1;
//        for (int x = 0; x <= 1200; x+= 4*9){
//            root = a.insert(root, x);
//            System.out.println(root.data);
//        }
//        root = a.insert(root, 200);
//        root = a.delete(root, 13);
//        System.out.println("[+] deleted "+ root);
//        boolean check_bst = a.isTreeBst(root);
//        System.out.println("[+] is BST? " + check_bst + "\n\t\t XXXXXXXXXXXXXXXXXXXXXXXX\n");
//
//        System.out.println("[+]--> Starting postorder traversal ");
//        a.inOrderTraverse(root);
//        System.out.println("\n\n[+]--> Starting preorder traversal ");
//        a.postOrderTraverse(root);
//        System.out.println("\n\n[+]--> Starting inorder traversal ");
//        a.inOrderTraverse(root);
//
//    }
//}
//
//
//
//
//
//
//
//
