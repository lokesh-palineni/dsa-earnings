package dsa.binarysearchtree;

public class DeleteInBST {

	static Node deleNode(Node root, int x) {
		if (root == null)
			return null;
		if (root.key > x)
			root.left = deleNode(root.left, x);
		else if (root.key < x)
			root.right = deleNode(root.right, x);
		else {
			if (root.left == null)
				return root.right;
			if (root.right == null)
				return root.left;
			else {
				Node succ = getSucc(root);
				root.key = succ.key;
				root.right = deleNode(root.right, succ.key);
			}

		}
		return root;
	}

	static Node getSucc(Node root) {
		Node curr = root.right;
		while (curr != null && curr.left != null) {
			curr = curr.left;
		}
		return curr;
	}

	public static void main(String[] args) {
		Node root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(70);
		root.left.left = new Node(10);
		root.left.right = new Node(40);
		root.right.left = new Node(60);
		root.right.right = new Node(80);
		deleNode(root, 60);

	}

}
