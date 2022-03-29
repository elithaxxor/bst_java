//
///* reconstruct bst from pre-order traversal */
//
//// binary tree will have 2 nodes
//// first element in deined traversal will be head
//// left subtree equation -->
//// START = POS 0,
//// LEFT HALF NODES WILL NEVER EXVEED START (POS 0)
//// lEFT HALF NODE i-1 FROM furtherspoint untl NULL
//// --> start, start+1, array - 1
//
//// RIGHT HALF NODES WILL NEVER BE LESS THAN START (
//// RIGHT HALF NODE i + 1 until NULL from mid
//// --> SPLIT THE BST IN IN TWO AND APPL;Y THE PROPERTIES TO LEFT AND RIGHT
//// LEFT == (array, startpos+1, i-1_
//// RIGHT == (array, i i-1)
//
//package ReconstructBST_Practice;
//
//
//public class Reconstruct_BST00 {
//
//    public Node createBST (int[] array, int start_pos, int end){
//        if (start > end){
//            return null;
//        }
//
//        Node node = createNewNode(array[start_pos]);
//
//        for (int i = start_pos + 1; i <= end; i++){
//
//        }
//
//
//    }
//}
