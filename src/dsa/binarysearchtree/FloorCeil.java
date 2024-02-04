package dsa.binarysearchtree;

public class FloorCeil {

	static Node floor(Node root, int x) {

		Node resNode = null;
		while (root != null) {
			if (root.key == x)
				return root;
			else if (root.key > x)
				root = root.left;
			else {
				resNode = root;
				root = root.right;
			}
		}
		return resNode;
	}

	static Node ceil(Node root, int x) {

		Node resNode = null;
		while (root != null) {
			if (root.key == x)
				return root;
			else if (root.key < x)
				root = root.right;
			else {
				resNode = root;
				root = root.left;
			}
		}
		return resNode;
	}

	public static void main(String[] args) {
		Node root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(70);
		root.left.left = new Node(10);
		root.left.right = new Node(40);
		root.right.left = new Node(60);
		root.right.right = new Node(80);
		System.out.println(floor(root, 12).key);
		System.out.println(ceil(root, 12).key);

	}

}
