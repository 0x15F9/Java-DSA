/**
 * Node
 */
public class Node {
    Node previousPointer;
    Node nextPointer;
    int data;

    public Node(int data) {
        this.previousPointer = null;
        this.nextPointer = null;
        this.data = data;
    }

    public Node getPreviousPointer() {
        return this.previousPointer;
    }

    public void setPreviousPointer(Node previousPointer) {
        this.previousPointer = previousPointer;
    }

    public Node getNextPointer() {
        return this.nextPointer;
    }

    public void setNextPointer(Node nextPointer) {
        this.nextPointer = nextPointer;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

}