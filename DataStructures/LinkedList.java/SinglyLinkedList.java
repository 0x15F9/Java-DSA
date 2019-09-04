/**
 * SinglyLinkedList
 */
public class SinglyLinkedList {
    private Node head;

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
        } else if (!head.hasNextPointer()) { // ll has 1 item
            if (data < head.getData())
                addDataAtHead(data);
            else
                addDataAtTail(data);
        } else {
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

    /**
     * Get tail node
     */
    public Node getTail() {
        Node node = head;
        while (node.hasNextPointer()) {
            node = node.getNextPointer();
        }
        return node;
    }

    /**
     * Delete the first Node
     */
    public void deleteFirst() {
        if (head != null) {
            Node prevHead = head;
            head = prevHead.getNextPointer();
            prevHead = null;
        }
    }

    /** Counts the number of nodes in the Linked list */
    public int nodeCount() {
        int count = 0;
        Node n = head;
        if (n != null) {
            while (n.hasNextPointer()) {
                count++;
                n = n.getNextPointer();
            }
            count++;
        }
        return count;
    }

    /**
     * Appends a second linked list at the end of the current one
     * 
     * @param sll
     */
    public void merge(SinglyLinkedList sll) {
        Node tail = getTail();
        tail.setNextPointer(sll.getHead());
    }

    // public void insertionSort() {
    // if (!isEmpty() || !head.hasNextPointer()) { // has more than 2 items

    // }
    // }

    /**
     * Swaps 2 nodes given the node and their previous node
     * 
     * @param node1prev
     * @param node1
     * @param node2
     * @param node2prev
     */
    public void swap(Node node1prev, Node node1, Node node2prev, Node node2) {
        Node t1 = node1;
        Node t2 = node2.getNextPointer();
        node1prev.setNextPointer(node2);
        node2.setNextPointer(node1.getNextPointer());
        node2prev.setNextPointer(t1);
        node1.setNextPointer(t2);
    }
}