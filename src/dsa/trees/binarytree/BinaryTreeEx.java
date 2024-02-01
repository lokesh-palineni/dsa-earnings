package dsa.trees.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node1 {
	int key;
	Node1 left;
	Node1 right;

	public Node1(int k) {
		key = k;
	}
}

public class BinaryTreeEx {

	static void printDist(Node1 root, int k) { // print the elements at the give k distance
		if (root == null)
			return;
		if (k == 0)
			System.out.print(root.key + " ");
		else {
			printDist(root.left, k - 1);
			printDist(root.right, k - 1);
		}
	}

	static void printLevel(Node1 root) { // print the elements in level wise 1st line,2nd line .....
		if (root == null)
			return;
		Queue<Node1> queue = new LinkedList<Node1>();

		queue.add(root);
		while (queue.isEmpty() == false) {
			Node1 curr = queue.poll();
			System.out.print(curr.key + " ");
			if (curr.left != null)
				queue.add(curr.left);
			if (curr.right != null)
				queue.add(curr.right);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node1 root = new Node1(10);
		root.left = new Node1(20);
		root.right = new Node1(30);
		root.left.left = new Node1(40);
		root.left.right = new Node1(50);
		root.right.right = new Node1(60);
		root.left.right.left = new Node1(70);
		root.left.right.right = new Node1(80);

		System.out.println("enter k value:");
//		int k = sc.nextInt();
//		printDist(root, k);
		printLevel(root);

	}

}
