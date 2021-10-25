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
	
}
