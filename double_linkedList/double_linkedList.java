package double_linkedList;

class Node{
    int data;
    Node next;
    Node prev;
}
public class double_linkedList {

    public Node createNewNode(int data){
        Node ll = new Node();
        ll.data = data;
        ll.next = null;
        ll.prev = null;
        System.out.println("Created node "+ ll.data);
        return ll;
    }

    public Node insert(int data, Node node){
        if(node == null){
            createNewNode(data);
            return node;
        }
        Node head = node;

        while (node.next != null){
            node = node.next;
        }
        Node a = new Node();
        a.prev = node;
        node.next = a;
        return head;
    }


    public Node insertFront (int data, Node node){
        System.out.println("Inserting "+ data + "to the front");
        if (node == null){
            Node a = createNewNode(data);
            a.next = node;
            return a;
        }
        Node r = node;
        return r;
    }

    public void insertByPos(int data, int pos, Node node){
        System.out.println("Inserting "+ pos + "to the front");
        if (pos < 1){
            System.out.println("Position "+ pos + "cannot be smaller than 1");
            return;
        }
        if(pos > 1 && node == null){
            System.out.println("Position "+ pos + "cannot be smaller than 1");
        }
        if (pos == 1){
            Node newNode = createNewNode(data);
            newNode.next = newNode;
            return;
        }
        insertByPos(data, pos-1, node);
    }

    public Node deleteLastNode(Node node){
        System.out.println("Deleting last node.");
        if(node == null || node.next == null){
            return null;
        }
        Node temp = node;
        while (temp != null){
            temp = temp.next;
        }
        temp.next = null;
        return node;
    }

    public Node deleteFirstNode(Node node){
        System.out.println("Deleting first node.");
        if (node == null) {
            return null;
        }
        return node.next;
    }

    public Node deleteAtElement(Node node, int position){
        System.out.println("Deleting node @ position" + position);
        if (position < 1){
            System.out.println("Invalid Posisiton");
            return node;
        }
        if (node == null && position > 1){
            System.out.println("Invalid Posisiton");
            return node;
        }
        if (position == 1){
            return node.next;
        }

        node.next = deleteAtElement(node, position-1);
        return node;
    }

    public int getSize(Node node){
        System.out.println("Getting LL size" );
        if (node == null){
            return 0 ;
        }
        return getSize(node.next) + 1;
    }


    public boolean nodeExists(Node node, int val){
        System.out.println("Checking if node exists for value: " + val);
        if (node == null){
            return false;
        }
        while (node != null){
            if (node.data == val){
                return true;
            }
            node = node.next;
        }
    return false;
    }

    // [LOGIC] --> create a dummy node. fast and slow --> the fast node will find end, slow node goes to n.
    // The slow and fast pointers should have a distance of n between them.

    public void removeNthFromEnd(Node node, int val){
        Node dummy = new Node();
        dummy = node;
        Node fast = node;
        Node slow = node;
        System.out.println("first"+fast);
        System.out.println("second"+slow);
        while (fast != null){
            fast = fast.next;
            System.out.println(fast);
            val--;
            if(val <= 0){
                slow = slow.next;
            }slow.next=slow.next.next;
        }
    }

    public int getSum(Node node){
        System.out.println("Adding Nodes in LinkedList-");
        int sum = 0;
        while (node != null){
            sum = sum + node.data;
            node = node.next;
        } return sum;
    }



    public void printList(Node node){
        if(node == null){
            System.out.println("[-]Node is Null");
            return;
        }
        System.out.println(node.data + "");
        printList(node.next);
    }

    public static void main (String[] args){
        double_linkedList a = new double_linkedList();
        Node head = null;

        head = a.insert(12, head);
        head = a.insert(99, head);
        head = a.insert(37, head);
        head = a.insert(33, head);
        head = a.insert(25, head);
        Node insert = a.insertFront(99, head);
        boolean exists0 = a.nodeExists(head, 99);
        System.out.println("XXXXXXXXXXXXX");
        a.printList(head);
        System.out.println("[+] exists? " + exists0);
        System.out.println("[+] head "+ head);
        System.out.println("[+] printing LL \n"+a.deleteLastNode(head));
        a.deleteAtElement(head, 3);
        a.printList(head);
        int size = a.getSize(head);
        boolean exists = a.nodeExists(head, 99);
        int sum = a.getSum(head);
        System.out.println("[+] exists? " + exists);
        System.out.println("[+] size " + size);
        System.out.println("[+] sum " + sum);

        // removeNodeFromEnd

    }

}

