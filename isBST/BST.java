package isBST;

public class BST {
    static int countElement = 0; // static int--> variable holds plae until end of execution [USE TO CALL RECURSIVE FUNCIOTNS]
                                /// regular int--> value dies at funciton end.

    public Node createNewNode(int nodeData) {
        Node a = new Node();
        a.data = nodeData;
        a.left = null;
        a.right = null;

        return a;
    }

    public Node insert(Node node, int value) {
        System.out.println("\t\t\t [+] Insert Delete Method--- \n\n");

        if (node == null) {
            System.out.println("[-] Node is Null");
            return createNewNode(value);
        }
        // assert node != null;
        if (value < node.data) {
            node.left = insert(node.left, value);
            System.out.println("[+] LEFT Node is " + node.data);

        } else {
            if (value > node.data) {
                node.right = insert(node.right, value);
                System.out.println("[+] RIGHT Node is " + node.data);
            }
            System.out.println("[+] Last Node is " + node.data);
            return node;

        }
        System.out.println("[+] Last Node is " + node.data);
        return node;
    }

    public Node delete(Node node, int value) {
        System.out.println("\t\t\t[+] Running Delete Method--- \n\n\n");
        if (node == null) {
            return null;
        } else {
            if (node.data < value) {
                node.left = delete(node.left, value);
            } else if (node.data > value) {
                node.right = delete(node.right, value);

            } else {
                if (node.left == null || node.right == null) {
                    Node temp = null;
                    temp = node.left == null ? node.right : node.left; // if the left is null, move temp to node.right else keep node.left
                    if (temp == null) { // or two if statmenets if node.left == null else if node.right == null
                        Node successor = getSuccessor(node);
                        System.out.println("\t\t\t[+] Left Node is Null--> Traversing Sucessors. Current Sucessor " + successor + "\n\n\n");
                        node.data = successor.data; // <------ [REMEMBER THIS MISTAKE] !!!!!!!!!!
                        node.right = delete(node.right, value);
                    } else {
                        return temp;
                    }
                    return temp;
                }
            }
        }

        return node;
    }

    public Node getSuccessor(Node node) {
        if (node == null) {
            return null;
        }
        Node temp = node.right;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }


    public boolean isTreeBst(Node node) {
        if (node == null) {
            return true;
        }
        if (!isTreeBst(node.left)) {
            return false;
        }
        if (node.prev != null && node.data < node.prev.data) {
            return false;
        }
        node.prev = node;
        return isTreeBst(node.right);
    }

    public void preOrder(Node node) {
        if (node == null) {
            // System.out.println("[-]--> BST starts with Null ");
            return;
        }
        System.out.print(", " + node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(", " + node.data);
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(", " + node.data);
        inOrder(node.right);
    }

    public int treeDepth(Node node){
        if (node == null){
            return -1;
        }
        return findMax(treeDepth(node.left), treeDepth(node.right))+1;
    }

    private int findMax(int left, int right) {
        return Math.max(left, right);
    }


    // CREATE BST FOR GET KTH ELMEEMTNHST --> YOU
    public Node createBST (int[] array, int start_pos, int end) {
        if (start > end) {
            return null;
        }

        Node node = createNewNode(array[start_pos]);
        int i = 0;
        for (i = start_pos + 1; i <= end; i++) { // traverse left half of node, stop at middle
            if (array[i] > node.data) { // middle
                break;
            }
        }
        node.left = createBST(array, start_pos + 1, i - 1);
        node.right = createBST(array, i, end);
        return node;
    }

    public Node getKthElementBST(Node node, int k){
        if(node == null){
            return null;
        }
        Node right = getKthElementBST(node.right, k);
        if (right != null){
            return right;
        } countElement++; // [DECLARED STATIC IN CLASS METHOD] -->

    if (countElement == k){
        return node;
    }
    return getKthElementBST(node.left, k);
}
    public Node invertBinary(Node node){
        if (node == null){
            return null;
        }
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
        return node;


    }

    import java.util.*;

    class Program {
        // This is an input class. Do not edit.
        static class BST {
            public int value;
            public BST left = null;
            public BST right = null;

            public BST(int value) {
                this.value = value;
            }
        }

        public BST reconstructBst(List<Integer> preOrderTraversalValues) {
            if (preOrderTraversalValues.size() == 0) {
                return null;
            }

            int currentValue = preOrderTraversalValues.get(0);
            int rightSubtreeRootIdx = preOrderTraversalValues.size();

            for (int idx = 1; idx < preOrderTraversalValues.size(); idx++) {
                int value = preOrderTraversalValues.get(idx);
                if (value >= currentValue) {
                    rightSubtreeRootIdx = idx;
                    break;
                }
            }
            BST leftSubtree = reconstructBst(preOrderTraversalValues.subList(1, rightSubtreeRootIdx));
            BST rightSubtree =
                    reconstructBst(preOrderTraversalValues.subList(rightSubtreeRootIdx, preOrderTraversalValues.size()));

            BST bst = new BST(currentValue);
            bst.left = leftSubtree;
            bst.right = rightSubtree;
            return bst;
        }
    }


    public static void main(String[] args) {
        Node root = null;
        Node prev = null;
        BST a = new BST();
        int val0 = 1;
        for (int x = 0; x <= 1200; x += 4 * 9) {
            root = a.insert(root, x);
            System.out.println(root.data);
        }
        root = a.insert(root, 200);
        root = a.delete(root, 13);
        System.out.println("[+] deleted " + root);
        boolean check_bst = a.isTreeBst(root);
        System.out.println("[+] is BST? " + check_bst + "\n\t\t XXXXXXXXXXXXXXXXXXXXXXXX\n");

        System.out.println("[+]--> Starting postorder traversal ");
        a.postOrder(root);
        System.out.println("\n\n[+]--> Starting preorder traversal ");
        a.preOrder(root);
        System.out.println("\n\n[+]--> Starting inorder traversal ");
        a.inOrder(root);
        System.out.println("\n\t\t XXXXXXXXXXXXXXXXXXXXXXXX\n");
        System.out.println("\n\n[+]--> Finding Max Depth (the  Binary Tree Height)  ");
        int treeDepth= a.treeDepth(root);
        System.out.println("\n[+]--> Tree Lenght: " + treeDepth);

        int k = 1;
        System.out.println("\n\n[+]--> Ks Largest-->  " +  kth_result);
        int kth_result = getKthElementBST(root, k);
        System.out.println("\n\n[+]--> Ks Largest-->  " +  kth_result);

    }

}



