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
        System.out.println("NULL]");
    }

}