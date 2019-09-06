/**
 * StackTest
 */
public class StackTest {

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(30);
        stack.push(20);
        stack.display();
        stack.pop();
        stack.display();

        System.out.println(stack.peek());
    }
}