/**
 * SinglyLinkedList
 */
public class SinglyLinkedList {
    Node head;

    /**
     * Create a singly linked list
     */
    public SinglyLinkedList() {
        this.head = null;
    }

    /**
     * Create a singly linked list with an initial node
     * 
     * @param data
     */
    public SinglyLinkedList(int data) {
        this.head = new Node(data);
    }

    /**
     * Add a new Node at head
     * 
     * @param data
     */
    public void addDataAtHead(int data) {
        Node n = new Node(data);
        if (this.head == null) {
            this.head = n;
        } else {
            n.setNextPointer(head);
            head = n;
        }
    }

    /**
     * Adds a new node in order, starting from the left
     * 
     * @param data
     */
    public void addDataInOrder(int data) {
        if (head == null) { // LL is empty
            addDataAtHead(data);
            return;
        }
        Node newNode = new Node(data);
        Node currentNode = head;
        Node nextNode = currentNode.getNextPointer();
        while (currentNode.hasNextPointer() && currentNode.getNextPointer().getData() < data) {
            currentNode = nextNode;
            nextNode = currentNode.getNextPointer();
        }
        newNode.setNextPointer(currentNode.getNextPointer());
        currentNode.setNextPointer(newNode);

    }

    /**
     * Add a new Node at tail
     * 
     * @param data
     */
    public void addDataAtTail(int data) {
        Node thisNode = head;
        Node newNode = new Node(data);
        if (thisNode == null) { // LL is currently empty
            head = newNode;
            return;
        }
        while (thisNode.hasNextPointer()) {
            thisNode = thisNode.getNextPointer();
        }
        thisNode.setNextPointer(newNode);
    }

    /**
     * Display the linked list
     */
    public void display() {
        System.out.print("[");
        display(this.head);
    }

    public void display(Node node) {
        if (node != null) {
            System.out.print(node.getData() + " > ");
            display(node.getNextPointer());
            return;
        }
        System.out.println("∅]");
    }

    /**
     * Returns true if a node which contains data
     * 
     * @param data
     * @return boolean exists
     */
    public boolean exists(int data) {
        Node node = head;
        while (node != null && node.getData() != data) {
            node = node.getNextPointer();
        }
        return node != null && node.getData() == data;
    }

    /**
     * Returns whether the head is null
     * 
     * @return
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Get the node pointed by head
     * 
     * @return
     */
    public Node getHead() {
        return head;
    }

}