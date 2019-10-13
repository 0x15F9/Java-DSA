public class QueueTest {

	public static void main(String[] args) {
	ArrayQueue aq = new ArrayQueue(4);
	System.out.println(aq.isEmpty());
	System.out.println(aq.isFull());
	aq.enqueue(1);
	aq.enqueue(2);
	aq.enqueue(3);
	aq.enqueue(4);
	System.out.println(aq.isEmpty());
	System.out.println(aq.isFull());	
	}
}
