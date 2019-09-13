class ArrayStack
{
	int[] stack;
	int size, head;

	public ArrayStack(int size)
	{
		stack = new int[size];
		this.size = size;
		head = -1;
	}

	public boolean isEmpty()
	{
		return head == -1;
	}

	public boolean isFull()
	{
		return head == size-1;
	}

	public boolean push(int data)
	{
		if(isFull())
			return false;
		stack[++head] = data;
		return true;	
	}

	public int pop()
	{
		if(isEmpty())
			return -1; // -1 is used to indicated error
		return stack[head--];		
	}
}
