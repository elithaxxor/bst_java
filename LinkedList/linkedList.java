//package LinkedList;
//
//
//// The first and last elements and the links between them are are objects
//// when creating a LL node, the next element is null
//// the tail ponter will be null
//// to set head -> set tail and head obj to val [STARTING VAL SHOULD BE NULL?]
//// the linked list starts at null, and it gets pushed forward.
//// if linked list pos[0] starts off as null, then push the val to first pos and null
//// The last pointer will allways point to null .
//// [LOGIC] --> to create a linked list, the inserted value will always traverse to the end, to null.
//// [LOGIC] --> the node will have a reference value.
//// [LOGIC] --> the object node will referecne to other objects, while the variable retains original memory reference
//// [LOGIC] --> the object should be referecning to a null.
//// ex - Root root = new Root()
//// reference = root; --> then root object is used to raverse.
//// [linked list craete node if node.next is not null]
//
//
//// insertion --> the first node cannot be less than pos 0
////
//class Node {
//    int i;
//    Node next;
//
//
//class Linked {
//
//    private Node getNewNode(int i) {
//        Node a = new Node();
//        a.i = i;
//        a.next = null;
//        return a;
//    }
//
//    public Node insert(int i, Node node) {
//        if (node == null) {
//            return getNewNode(i);
//        } else {
//            node.next = insert(i, node.next);
//        }
//        return null;
//    }
//
//    // with iterative each value is defined by the one before it (as the next node)
//    // each node is defined as [val + next] (the next serves as a pointer)
//
//    public Node iterativeInsert(int i, Node node) {
//        System.out.println(i);
//        if (node == null) {
//            return;
//        }
//        return node;
//
//    }
//
//
//    private void printList(Node node) {
//        if (node == null) {
//            return;
//        } else {
//            System.out.println(node.i); // print val
//            printList(node.next);       // recursive call
//        }
//    }
//
//
//        class linkedList {
//            public void main(String[] args) {
//                Node root = null;
//                Linked a = new Linked();
//                Node insert_result = a.insert(2, root);
//                Node insert_result0 = a.insert(7, root);
//                Node insert_result1 = a.insert(8, root);
//                System.out.println("[+]--> Creating Linked List " + insert_result);
//                a.printList(root);
//            }
//        }}}
//
//
////
////
////public static class LLiterative(){
////    public static void main (String[] args){
////        LLiterative obj = new LLiterative();
////        Node start = null;
////
////        Node insert_res = obj.insert(start, 10);
////        System.out.println(insert_res);
////    }
////
////    private Node getNewNode(Node node int val) {
////        if (node == null){
////            insert(node, val);
////        }
////        Node root = null;
////        newNode.data = val;
////        newNode.next = null;
////        return newNode;
////    }
////
////    public Node insert(Node node, int val) {
////        if (node == null) {
////            return getNewNode(val);
////        }
////        return null;
////    }
////
////
////
////
////
////
////
////// Feel free to add new properties and methods to the class.
////class Program {
////    static class DoublyLinkedList {
////        public Node head;
////        public Node tail;
////
////        public void setHead(Node node) {
////            if(node == null){
////                head = node;
////                tail = node;
////                return;
////            }
////            insertBefore(head, node);
////        }
////        public void setTail(Node node) {
////            if (node ==)
////        }
////
////        public void insertBefore(head, Node node){
////            System.out.println();
////        }
////
////        public void insertBefore(Node node, Node nodeToInsert){
////            if (nodeToInsert == head || nodeToInsert == tail){
////                System.out.println();
////            }
////        }
////
////
////
////        public void insertBefore(Node node, Node nodeToInsert) {
////            // Write your code here.
////        }
////
////        public void insertAfter(Node node, Node nodeToInsert) {
////            // Write your code here.
////        }
////
////        public void insertAtPosition(int position, Node nodeToInsert) {
////            // Write your code here.
////        }
////
////        public void removeNodesWithValue(int value) {
////            // Write your code here.
////        }
////
////        public void remove(Node node) {
////            // Write your code here.
////        }
////
////        public boolean containsNodeWithValue(int value) {
////            // Write your code here.
////            return false;
////        }
////    }
////
////    // Do not edit the class below.
////    static class Node {
////        public int value;
////        public Node prev;
////        public Node next;
////
////        public Node(int value) {
////            this.value = value;
////        }
////    }
////}
