package binarytree;

public class Tree {

	private class Node{

		private int value;
		private Node leftChild;
		private Node rightChild;

		public Node(int value) {
			this.value = value;
		}
		@Override
		public String toString() {
			return "Node : "+" "+value;
		}
	}
	private Node root;
	//Insert operation in a binary search tree
	public void insert(int value) {
		//When the tree is an Empty tree
		if(root == null) {
			//If the root node is null[means tree is empty].So create a new Node and assign it to root,as its the only node in the entire tree]
			root = new Node(value);
			return;
		}
		//When tree is not empty,we need to find the parent node for the item we want to insert
		else {
			Node current = root;
			while (true) {
				if (value < current.value) {
					if(current.leftChild == null) {
						current.leftChild = new Node(value);
						break;
					}
					current = current.leftChild;
				} else {
					if (value > current.value) {
						if(current.rightChild == null) {
							current.rightChild = new Node(value);
							break;
						}
						current = current.rightChild;
					}
				}
			}

		}
	}
	//Find Operation in a Birary Tree
	public boolean find(int value) {
		if(root == null)
    		return false;
		Node current = root;
        while(current != null) {
        	if(value < current.value) {
        		current = current.leftChild;
        	}else if(value > current.value){
        		current = current.rightChild;
        	}else {
        		return true;
        	}
        }
        return false;
	}
	//PreOrder Traversal of Binary Tree
	private void preOrderTraversal(Node root) {
		if (root == null)
			return;
		System.out.println(root);
		preOrderTraversal(root.leftChild);
		preOrderTraversal(root.rightChild);
	}
	
	public void preOrderTraversal() {
		preOrderTraversal(root);
	}
	
	//InOrder Traversal of Binary Tree
	private void inOrderTraversal(Node root) {
		if(root == null)
			return;
		inOrderTraversal(root.leftChild);
		System.out.println(root);
		inOrderTraversal(root.rightChild);
	}
	public void inOrderTraversal() {
		inOrderTraversal(root);
	}
	
	//PostOrder Traversal of Binary Tree
		private void postOrderTraversal(Node root) {
			if(root == null)
				return;
			postOrderTraversal(root.leftChild);
			postOrderTraversal(root.rightChild);
			System.out.println(root);
		}
		public void postOrderTraversal() {
			postOrderTraversal(root);
		}
		
		//Calculate Height of a Tree
		private int getTreeHeight(Node root) {
			if(root == null)
				return -1;
			if(root.leftChild == null && root.rightChild == null)
				return 0;
			return 1+Math.max(getTreeHeight(root.leftChild), getTreeHeight(root.rightChild));
		}
		public int getTreeHeight() {
			return getTreeHeight(root);
		}
		
		//Find min value in a Binary Tree
		//Note : The algo used is post-order traversal , as we need to evaluate the leaf nodes first
		private int findMin(Node root) {
			if(root == null)
				return -1;
			//If root node has no leaf nodes , then return the value of the root
			if(isLeaf(root))
				return root.value;
			int left = findMin(root.leftChild);
			int right = findMin(root.rightChild);
			return Math.min(Math.min(left, right),root.value);
		}
		
		private boolean isLeaf(Node node) {
			return node.leftChild == null && node.rightChild == null;
		}
		public int findMin() {
			return findMin(root);
		}
}
