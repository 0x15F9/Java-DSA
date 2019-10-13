/*
 * This implementation is flawed as after repeated push and pop, data shifts to the right
 */

class ArrayQueue {
	int[] queue;
	int head, tail, size;

	public ArrayQueue(int size) {
		queue = new int[size];
		this.size = size;
		head = 1; // add at head
		tail = 0; // remove at tail
		// an empty slot is left to counter help distinguish empty from full
	}

	public boolean isEmpty() {
		return tail - head == 1;
	}

	public boolean isFull() {
//		return tail - head == size - 1;
		return tail == size-1;
	}

	public boolean enqueue(int data) {
		if (isFull())
			return false;
		queue[++tail] = data;
		return true;
	}

	public int dequeue() {
		if (isEmpty())
			return -1; // -1 signifies error
		return queue[++head];
	}
}
