package dsa.trees.binarytree;

class Node1 {
	int key;
	Node1 left;
	Node1 right;

	public Node1(int k) {
		key = k;
	}
}

public class BinaryTreeEx {

	public static void main(String[] args) {
		Node1 root = new Node1(10);
		root.left = new Node1(20);
		root.right = new Node1(30);
		root.left.left = new Node1(40);
		root.left.right = new Node1(50);
		root.right.right = new Node1(60);
		root.left.right.left = new Node1(70);
		root.left.right.right = new Node1(80);

	}

}
