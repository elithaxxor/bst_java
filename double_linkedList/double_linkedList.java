package double_linkedList;

class Node{
    int data;
    Node next;
    Node prev;
}
public class double_linkedList {
    public createNewNode(int i){
        Node ll = new Node();
        ll.data = i;
        ll.next = null;
        ll.prev = null;
    }
    public Node insert(int i, Node node){
        inf(node == null){
            return createNewNode(i);
        }

        Node head = node;
        while (node.next != null){
            node = node.next;
        }
        Node a = new Node();
        a.previous = node;
        node.next = a;
        return head;
    }
}

 class run_doubleLinkedList{
    public static void main (String[] args){
        double_linkedList a = new double_linkedList();
        Node head = null;

        head = a.insert(12, head);
        head = a.insert(99, head);
        head = a.insert(37, head);
        head = a.insert(33, head);
        head = a.insert(25, head);

    }
}
