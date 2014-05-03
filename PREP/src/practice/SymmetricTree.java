package practice;

import java.util.Stack;

public class SymmetricTree {
	BinarySearchNode root;
	public SymmetricTree(int value){
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
	public boolean Symmetric(BinarySearchNode root){
		BinarySearchNode left, right;
		Stack<BinarySearchNode> storeleft = new Stack<BinarySearchNode>();
		Stack<BinarySearchNode> storeright = new Stack<BinarySearchNode>();
		left=root.getLeft();
		right=root.getRight();
		if(depth(left)!=depth(right))
			return false;
		do {
			if (left == null && right==null) {
				left = storeleft.pop();
				right=storeright.pop();
				//System.out.println(current.getValue());
				left = left.getRight();
				right=right.getLeft();
			} else if(left!=null && right!=null) {
				storeleft.push(left);
				storeright.push(right);
				left = left.getLeft();
				right=right.getRight();
			} else
				return false;
		} while (!storeleft.empty() || left != null);
		return true;
	}
	public static int depth(BinarySearchNode tree) {
		if (tree == null)
			return 0;
		return Math.max(depth(tree.getLeft()), depth(tree.getRight())) + 1;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SymmetricTree st = new SymmetricTree(10);
		st.addValue(5);
		st.addValue(30);
		st.addValue(1);
		st.addValue(32);
		System.out.println(st.Symmetric(st.root));
	}

}
