class Node {
	int data;
	Node right, left;

	public Node(int data) {
		this.data = data;
		this.right = null;
		this.left = null;
	}

	public Node getRight() {
		return this.right;
	}

	public Node getLeft() {
		return this.left;
	}

	public int getData() {
		return this.data;
	}

	public void setRight(Node node) {
		this.right = node;
	}

	public void setLeft(Node node) {
		this.left = node;
	}

	public void setData() {
		this.data = data;
	}

	public void setRight(int data) {
		this.right = new Node(data);
	}

	public void setLeft(int data) {
		this.left = new Node(data);
	}

	public boolean hasLeft() {
		return this.left != null;
	}

	public boolean hasRight() {
		return this.right != null;
	}
}
