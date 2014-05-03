package practice;

public class PreorderInorder {

	public static void main(String[] args) {

		String preorder = "ABDEC";
		String inorder = "DBEAC";

		Node root = new Node(preorder.charAt(0));

		for (int i = 1; i < preorder.length(); i++) {
			build(root, i, preorder, inorder);			
		}
		traverse(root);
	}

	public static void build(Node parent, int index, String preorder,
			String inorder) {
		boolean left = false;

		for (int i = 0; i < inorder.length(); i++) {
			if (inorder.charAt(i) == parent.value) {
				break;
			} else if (inorder.charAt(i) == preorder.charAt(index)) {
				left = true;
				break;
			}
		}

		if (left) {
			if (parent.left == null)
				parent.left = new Node(preorder.charAt(index));
			else
				build(parent.left, index, preorder, inorder);
		} else {
			if (parent.right == null)
				parent.right = new Node(preorder.charAt(index));
			else
				build(parent.right, index, preorder, inorder);
		}
	}
	public static void traverse(Node tree) {
		if (tree != null) {
			traverse(tree.left);
			System.out.println(tree.value);
			traverse(tree.right);
		}
	}
}


class Node {
	char value;
	Node left;
	Node right;

	public Node(char v) {
		value = v;
	}
}
