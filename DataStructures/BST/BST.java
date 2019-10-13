class BST {
	Node root;

	public BST(int data) {
		this.root = new Node(data);
	}

	public void traverseInOrder() {
		traverseInOrder(root);
		System.out.println();
	}

	public void traverseInOrder(Node root) {
		if (root.hasLeft())
			traverseInOrder(root.getLeft());
		System.out.print(root.getData() + " ");
		if (root.hasRight())
			traverseInOrder(root.getRight());
	}
}
