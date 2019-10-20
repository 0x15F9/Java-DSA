/**
 * PriorityQueue
 */
public class PriorityQueue {

    int[] pq; // index 0 is not considered
    int tail; // points to last element in pq. 0 => empty

    public PriorityQueue(int size) {
        pq = new int[size + 1];
        tail = 0;
    }

    public PriorityQueue(int[] arr) {
        tail = arr.length + 1;
        pq = new int[tail];

        for (int i = 0; i < arr.length; i++) {
            pq[i + 1] = arr[i]; // shift elements rightwards by one
        }
    }

    public boolean hasLeftChild(int i) {
        return i * 2 < tail;
    }

    public boolean hasRightChild(int i) {
        return i * 2 + 1 < tail;
    }

    public boolean hasChild(int i) {
        return hasLeftChild(i) || hasRightChild(i);
    }

    public int getParentIndex(int i) {
        int parentIndex = i / 2;
        return parentIndex > 0 ? parentIndex : 0;
    }

    public int getLeftChildIndex(int i) {
        int childIndex = i * 2;
        return childIndex < tail ? childIndex : 0;
    }

    public int getRightChildIndex(int i) {
        int childIndex = i * 2 + 1;
        return childIndex < tail ? childIndex : 0;
    }

    public int getParent(int i) {
        return pq[getParentIndex(i)];
    }

    public int getLeftChild(int i) {
        return pq[getLeftChildIndex(i)];
    }

    public int getRightChild(int i) {
        return pq[getRightChildIndex(i)];
    }

    public void display() {
        for (int i = 0; i < tail; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.print("X  ");
        for (int i = 1; i < tail; i++) {
            System.out.print(pq[i] + "  ");
        }
        System.out.println("\n");
    }

    public void swap(int ix_one, int ix_two) {
        int temp = pq[ix_one];
        pq[ix_one] = pq[ix_two];
        pq[ix_two] = temp;
    }

    // ensures that element i is at its correct position
    public void maxHeapify(int i) {
        int largest_val = pq[i];
        int largest_ix = i;
        if (getLeftChild(i) > largest_val) {
            largest_val = getLeftChild(i);
            largest_ix = getLeftChildIndex(i);
        }
        if (getRightChild(i) > largest_val) {
            largest_val = getRightChild(i);
            largest_ix = getRightChildIndex(i);
        }
        if (largest_val != pq[i]) {
            swap(largest_ix, i);
            if (hasChild(i))
                maxHeapify(largest_ix);
        }
    }

    public void buildMaxHeap() {
        for (int i = pq.length / 2; i > 0; i--)
            maxHeapify(i);
    }

    public void heapsort() {
        int temp = tail;
        while (tail > 1) {
            // pq[--tail] = pq[1];
            swap(1, --tail);
            maxHeapify(1);
        }
        tail = temp;
    }

}