/**
 * SinglyLinkedListTest
 */
public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        System.out.println(singlyLinkedList.isEmpty());
        singlyLinkedList.addDataAtTail(1);
        singlyLinkedList.addDataAtTail(2);
        singlyLinkedList.addDataAtTail(5);
        // singlyLinkedList.display();
        singlyLinkedList.addDataInOrder(1);
        singlyLinkedList.addDataInOrder(4);
        singlyLinkedList.addDataInOrder(3);
        singlyLinkedList.display();
        System.out.println(singlyLinkedList.isEmpty());

    }
}