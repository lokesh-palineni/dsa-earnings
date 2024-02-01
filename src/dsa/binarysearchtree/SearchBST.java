package dsa.binarysearchtree;

class Node {
	int key;
	Node left, right;

	public Node(int x) {
		key = x;
	}
}

public class SearchBST {

	static boolean searchRec(Node root, int x) {
		if (root == null)
			return false;
		else if (root.key == x)
			return true;
		else if (root.key < x)
			return searchRec(root.right, x);
		else
			return searchRec(root.left, x);

	}

	static boolean searchIte(Node root, int x) {

		while (root != null) {
			if (root.key == x)
				return true;
			else if (root.key < x)
				root = root.right;
			else
				root = root.left;
		}
		return false;
	}

	public static void main(String[] args) {

		Node root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(70);
		root.left.left = new Node(10);
		root.left.right = new Node(40);
		root.right.left = new Node(60);
		root.right.right = new Node(80);

		System.out.println(searchRec(root, 40));
		System.out.println(searchIte(root, 37));

	}

}
