/**
 * Queue
 */
public class Queue extends SinglyLinkedList {

    /**
     * Inserts data at tail
     */
    public void enqueue(int data) {
        addDataAtTail(data);
    }

    /**
     * Removes data from the end of the queue. End == head in this implementation
     */
    public void dequeue() {
        if (getHead() != null) {
            if (getHead().hasNextPointer()) {
                setHead(getHead().getNextPointer());
            } else {
                setHead(null);
            }
        }
    }

    /**
     * Shows data which pop is supposed to remove
     * 
     * @return
     */
    public int peek() {
        return isEmpty() ? -1 : getHead().getData();
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    /**
     * Repeatedly dequeues data and displays it
     */
    public void display() {
        while (!isEmpty()) {
            System.out.print(peek() + " ");
            dequeue();
        }
        System.out.println();
    }
}