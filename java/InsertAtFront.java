import org.w3c.dom.Node;

public class InsertAtFront {
    public Node insertAtFront(Node head, int x) {
        // code here
        Node newNode = new Node(x);
        newNode.next = head;
        return newNode;
    }
} return newNode;
