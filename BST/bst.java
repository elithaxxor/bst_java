//package BST;
///* BST CONSTCUTION
//* INSERT (AND CREATE NODE IF EMPTY); DELETE; AND TRAVERSE.
//*  */
//
//class Node{
//    int data;
//    Node left;
//    Node right; }
//
// class BST0 {
//     public Node createNewNode(int k) {
//         Node a = new Node();
//         a.data = k;
//         a.left = null;
//         a.right = null;
//         return a;
//     }
//
//     public Node insert(Node node, int val) {
//         if (node == null) {
//             return createNewNode(val);
//         }
//         if (val < node.data) {
//             node.left = insert(node.left, val);
//         } else if (val > node.data) {
//             node.right = insert(node.right, val);
//         }
//         return node;
//     }
//
//     public Node delete(Node node, int val) {
//         System.out.println("[+] Deleting node " + val);
//         if (node == null) {
//             return null;
//         }
//         if (val < node.data) {
//             node.left = delete(node.left, val);
//         } else if (val > node.data) {
//             node.right = delete(node.right, val);
//         } else {
//             if (node.left == null || node.right == null) {
//                 Node temp = null;
//                 temp = node.left == null ? node.right : node.left;
//                 if (temp == null) {
//                     return null;
//                 } else {
//                     return node;
//                 }
//             } else { // if both nodes are present
//                 Node Successor = getSuccessor(node);
//
//             }
//         }
//         return node;
//     }
//
//     public Node getSuccessor(Node node) { // part of delete
//         System.out.println("[+] Getting Sucessor" + node);
//         if (node == null) {
//             return null;
//         }
//         Node temp = node.right;
//         while (temp != null){
//             temp = temp.left;
//         }
//         return temp;
//     }
//
//     //// [TRAVERSALS] --->
//     public void inOrder(Node node){ // KEEP MOVING LEFT UNTIL NULL VAL IS FOUND
//         System.out.println("[-] inorder traversal" + node);
//         if(node == null) {
//             return;
//         }
//         inOrder(node.left);
//         System.out.println("[+] Traversing the Left (inorder traversal)" + node.data);
//         inOrder(node.right);
//         System.out.println("[+] Traversing the right (inorder traversal)" + node.data);
//     }
//     public void preOrder(Node node){ // NODE THEN LEFT THEN  RIGHT
//         System.out.println("[+] inorder traversal" + node);
//         if (node == null){
//             return;
//         }
//         System.out.println("[+] Traversing the Left (preOrder traversal)" + node.data);
//         preOrder(node.left);
//         preOrder(node.right);
//     }
//     public void postOrder(Node node){ // LEFT RIGHT NODE
//         int Count = 0;
//         System.out.println("[+] Post-Order traversal " + node );
//         if (node == null){
//             return;
//         }
//     postOrder(node.left);
//     postOrder(node.left);
//         Count = Count +1;
//     }
//
// }
//
//public class bst{
//    public static void main(String[] args){
//        BST0 a = new BST0();
//        Node root = null;
//
//        // INSERT
//        root = a.insert(root,8);
//        root = a.insert(root,3);
//        root = a.insert(root,46);
//        root = a.insert(root,10);
//        root = a.insert(root,4);
//        root = a.insert(root,7);
//        root = a.insert(root,1);
//        root = a.insert(root,14);
//        root = a.insert(root,13);
//        System.out.println(root);
//
//        // DEL
//        root  = a .delete(root, 10);
//        System.out.println(root);
//
//        // TRAVERSAL
//        a.inOrder(root);
//        a.preOrder(root);
//        a.postOrder(root);
//
//
//
//    }
//}
