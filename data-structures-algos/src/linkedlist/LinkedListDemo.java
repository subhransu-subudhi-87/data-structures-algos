package linkedlist;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();
		linkedList.addLast(32);
		linkedList.addLast(39);
		linkedList.addLast(35);
		linkedList.addFirst(31);
		linkedList.printLinkedList();
		System.out.println("The index is : "+linkedList.indexOf(4));
		System.out.println("The item exists : "+linkedList.contains(33));
	}

}
