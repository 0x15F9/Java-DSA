/**
 * SinglyLinkedListTest
 */
public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList1 = new SinglyLinkedList();
        singlyLinkedList1.addDataInOrder(1);
        singlyLinkedList1.addDataInOrder(2);
        singlyLinkedList1.addDataInOrder(3);
        singlyLinkedList1.addDataInOrder(4);
        singlyLinkedList1.display();
        SinglyLinkedList singlyLinkedList2 = new SinglyLinkedList();
        singlyLinkedList2.addDataInOrder(2);
        singlyLinkedList2.addDataInOrder(3);
        singlyLinkedList2.addDataInOrder(4);
        singlyLinkedList2.addDataAtHead(5);
        singlyLinkedList2.display();
        singlyLinkedList1.merge(singlyLinkedList2);
        singlyLinkedList2.display();
        singlyLinkedList1.display();
    }
}