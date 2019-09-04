/**
 * SinglyLinkedListTest
 */
public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        System.out.println(singlyLinkedList.nodeCount());
        singlyLinkedList.addDataAtTail(1);
        singlyLinkedList.addDataAtTail(2);
        System.out.println(singlyLinkedList.nodeCount());
        singlyLinkedList.deleteFirst();
        singlyLinkedList.deleteFirst();
        singlyLinkedList.addDataInOrder(4);
        singlyLinkedList.addDataInOrder(3);
        singlyLinkedList.addDataInOrder(5);
        System.out.println(singlyLinkedList.nodeCount());
        singlyLinkedList.display();

    }
}