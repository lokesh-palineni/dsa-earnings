package dsa.binarysearchtree;

//class Node {
//	int key;
//	Node left, right;
//
//	public Node(int x) {
//		int key = x;
//	}

//}

public class InsertInBST {

	static Node iterative(Node root, int x) {

		Node temp = new Node(x);
		Node curr = root;
		Node parent = null;

		while (curr != null) {
			parent = curr;
			if (curr.key > x)
				curr = curr.left;
			else if (curr.key < x) {
				curr = curr.right;
			} else {
				return root;
			}
		}

		if (parent == null) {
			return temp;
		}
		if (parent.key > x) {
			parent.left = temp;
		} else
			parent.right = temp;

		return root;

	}

	static Node recursive(Node root, int x) {
		if (root == null)
			return new Node(x);
		else if (root.key > x)
			root.left = recursive(root.left, x);
		else
			root.right = recursive(root.right, x);

		return root;
	}

	public static void main(String[] args) {
		Node root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(70);
		root.left.left = new Node(10);
		root.left.right = new Node(40);
		root.right.left = new Node(60);
		root.right.right = new Node(80);
		iterative(root, 10);
		recursive(root, 20);
	}

}
