/**
 * Stack Implementation of a stack using Linked List
 */
public class Stack extends SinglyLinkedList {

    /**
     * Checks if the stack is currently empty
     */
    public boolean isEmpty() {
        return super.isEmpty();
    }

    /**
     * Push data onto the stack
     * 
     * @param data
     */
    public void push(int data) {
        addDataAtHead(data);
    }

    /**
     * Removes the top-most element
     */
    public void pop() {
        deleteFirst();
    }

    /**
     * Get the value of the top-most element
     * 
     * @return value or -1 if empty
     */
    public int peek() {
        return isEmpty() ? -1 : getHead().getData();
    }

    /**
     * Displays the stack by repeatedly popping the top-most element
     */
    public void display() {
        while (!isEmpty()) {
            System.out.print(peek() + " ");
            pop();
        }
        System.out.println();
    }

}