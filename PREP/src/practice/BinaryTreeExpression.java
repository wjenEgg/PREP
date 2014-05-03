package practice;

import java.util.Stack;

public class BinaryTreeExpression {
	public class Node {
		public String value;
		public boolean operator;
		public Node left = null;
		public Node right = null;
		public Node(String value, boolean operator){
			this.value = value;
			this.operator = operator;
		}
	}
	public static Stack<String> result = new Stack<String>();
	public static void traverseWithParentheses(Node root) {
		String value1;
		String value2;
		if (root != null) {
			traverseWithParentheses(root.left);
			traverseWithParentheses(root.right);
			if (root.operator == true){
				value2 = result.pop();
				value1 = result.pop();
				result.push("(" + value1 + root.value + value2 + ")");
			}
			else
				result.push(root.value);
		}
	}
	public static void traverse(Node root) {
		if (root != null) {
			traverse(root.left);
			traverse(root.right);
			System.out.print(root.value);
		}
	}
	public static void main(String[] args){
		BinaryTreeExpression bte = new BinaryTreeExpression();
		Node root = bte.new Node("-", true);
		root.left = bte.new Node("*", true);
		root.right = bte.new Node("A", false);
		root.left.left = bte.new Node("+", true);
		root.left.right = bte.new Node("B", false);
		root.left.left.left = bte.new Node("M", false);
		root.left.left.right = bte.new Node("N", false);
		BinaryTreeExpression.traverseWithParentheses(root);
		System.out.println(BinaryTreeExpression.result.pop());
		BinaryTreeExpression.traverse(root);
	}
}
