/**
 * QueueTest
 */
public class QueueTest {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.display();
        queue.enqueue(10);
        queue.display();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.enqueue(30);
        queue.display();
    }
}