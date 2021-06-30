package linkedlist;

public class LinkedList {
	
	private class Node<T> {
		private T data;
		private Node next;

		public Node(T data) {
			this.data = data;
		}
	}

	private Node head;
	private Node tail;
	
	public void addLast(int item) {
		Node newNode = new Node(item);
		if(isEmpty()) {
			head=tail=newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void addFirst(int item) {
		Node newNode = new Node(item);
		if(isEmpty())
			head=tail=newNode;
		newNode.next = head;
		head = newNode;
	}

	private boolean isEmpty() {
		return head == null;
	}
	
	public void printLinkedList() {
		if(isEmpty())
			 return;
		Node tempHead = head;
		while(tempHead != null) {
			System.out.println(tempHead.data);
			tempHead = tempHead.next;
		}
	}
	
	public int indexOf(int item) {
		int index = 0;
		Node currentNode = head;
		while(currentNode != null) {
			if(item == (int)currentNode.data)
				 return index;
			currentNode = currentNode.next;
			index++;
		}
		return -1;
	}
	
	public boolean contains(int item) {
		boolean status = (!isEmpty() && indexOf(item) != -1)?true:false;
		return status;
	}
}
