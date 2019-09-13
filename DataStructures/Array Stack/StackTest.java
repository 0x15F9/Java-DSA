class StackTest
{
	public static void main(String[] args)
	{
		ArrayStack as = new ArrayStack(3);
		System.out.println(as.isEmpty()); // Should be true
		System.out.println(as.pop()); // Should be -1
		as.push(1);
		as.push(2);
		as.push(3);

		System.out.println(as.isFull()); // Should be true
		System.out.println(as.push(4)); // Should be false

		
		System.out.println(as.pop()); // Should be 3
		System.out.println(as.pop()); // Should be 2
		System.out.println(as.pop()); // Should be 1
		System.out.println(as.pop()); // Should be -1
	}
}
