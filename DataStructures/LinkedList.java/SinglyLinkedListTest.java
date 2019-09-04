/**
 * SinglyLinkedListTest
 */
public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        // singlyLinkedList.addDataAtTail(1);
        // singlyLinkedList.addDataAtTail(2);
        // singlyLinkedList.deleteFirst();
        // singlyLinkedList.deleteFirst();
        singlyLinkedList.addDataInOrder(4);
        singlyLinkedList.addDataInOrder(3);
        singlyLinkedList.addDataInOrder(5);
        singlyLinkedList.display();

    }
}