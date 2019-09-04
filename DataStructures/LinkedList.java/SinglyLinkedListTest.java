/**
 * SinglyLinkedListTest
 */
public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addDataInOrder(1);
        sll.addDataInOrder(2);
        sll.addDataInOrder(3);
        sll.addDataInOrder(4);
        sll.addDataInOrder(5);
        sll.addDataInOrder(6);
        System.out.print("Before ");
        sll.display();
        Node pa = sll.getHead();
        Node a = pa.getNextPointer();

        Node pb = a.getNextPointer().getNextPointer();
        Node b = pb.getNextPointer();

        System.out.println(pa.getData());
        System.out.println(a.getData());
        System.out.println(pb.getData());
        System.out.println(b.getData());

        sll.swap(pa, a, pb, b);

        sll.display();
    }
}