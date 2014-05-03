package practice;

import java.util.Stack;

public class BinarySearchTree {
	private BinarySearchNode root;

	public BinarySearchTree(int value) {
		root = new BinarySearchNode(value);
	}

	public void addValue(int value) {
		BinarySearchNode current = root;
		BinarySearchNode prev = current;
		while (current != null) {
			prev = current;
			if (current.getValue() >= value)
				current = current.getLeft();
			else
				current = current.getRight();
		}
		if (prev.getValue() >= value)
			prev.setLeft(new BinarySearchNode(value));
		else
			prev.setRight(new BinarySearchNode(value));
	}

	public static void traverse(BinarySearchNode tree) {
		if (tree != null) {
			traverse(tree.getLeft());
			System.out.println(tree.getValue());
			traverse(tree.getRight());
		}
	}

	public void nonrecursive() {
		Stack<BinarySearchNode> store = new Stack<BinarySearchNode>();
		BinarySearchNode current = root;
		int previous=Integer.MIN_VALUE;
		do {
			if (current == null) {
				current = store.pop();
				if(current.getValue()<previous){
					System.out.println("not a bst");
					break;
				} else{
					System.out.println(current.getValue());
					previous=current.getValue();
				}
				current = current.getRight();
			} else {
				store.push(current);
				current = current.getLeft();
			}
		} while (!store.empty() || current != null);
	}

	public static int depth(BinarySearchNode tree) {
		if (tree == null)
			return 0;
		return Math.max(depth(tree.getLeft()), depth(tree.getRight())) + 1;
	}

	public static void main(String args[]) {
		BinarySearchTree bst = new BinarySearchTree(10);
		bst.addValue(5);
		bst.addValue(51);
		bst.addValue(34);
		bst.addValue(32);
		bst.addValue(6);
		// bst.addValue(100);
		// bst.addValue(69);
		// bst.addValue(8);
		// bst.addValue(74);
		// bst.addValue(78);
		// BinarySearchTree.traverse(bst.root);
		bst.nonrecursive();
		
		System.out.println(BinarySearchTree.depth(bst.root));
	}
}
