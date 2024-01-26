package dsa.trees.binarytree;

class Node {
	int key;
	Node left;
	Node right;

	public Node(int k) {
		key = k;
	}
}

public class TreeTraversalInPrePost {

	static void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.key + " ");
			inOrder(root.right);
		}
		System.out.println("empty");
	}

	static void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.key + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	static void postOrder(Node root) {
		if (root != null) {
			postOrder(root.right);
			postOrder(root.left);
			System.out.print(root.key + " ");

		}
	}

	public static void main(String[] args) {

		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.right = new Node(60);
		root.left.right.left = new Node(70);
		root.left.right.right = new Node(80);

		System.out.print("inOrder:");
		inOrder(root);
		System.out.println();
		System.out.print("preOrder:");
		preOrder(root);
		System.out.println();

		System.out.print("postOrder:");
		postOrder(root);

	}

}
