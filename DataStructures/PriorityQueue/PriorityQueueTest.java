/**
 * PriorityQueueTest
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        int[] pq_arr = { 8, 2, 5, 4, 7, 10, 3 };
        PriorityQueue pq = new PriorityQueue(pq_arr);
        pq.display();
        pq.buildMaxHeap();
        pq.display();
        pq.heapsort();
        pq.display();
        pq.buildMaxHeap();
        pq.display();
    }
}