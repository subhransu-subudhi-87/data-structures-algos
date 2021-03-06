package binarytree;

public class BinaryTreeApp {

	public static void main(String[] args) {

		Tree tree = new Tree();
		tree.insert(7);
		tree.insert(4);
		tree.insert(1);
		tree.insert(9);
		tree.insert(6);
		tree.insert(8);
		tree.insert(10);
        System.out.println("Done");
        System.out.println(tree.find(10));
        tree.preOrderTraversal();
        System.out.println("The height of the tree is : "+tree.getTreeHeight() );
        System.out.println("The min value in the tree is : "+tree.findMin() );
	}

}
