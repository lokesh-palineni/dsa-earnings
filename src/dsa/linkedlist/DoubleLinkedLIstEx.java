package dsa.linkedlist;

public class DoubleLinkedLIstEx {
	Node head;

	class Node {
		int data;
		Node prev;
		Node next;

		public Node(int data) {
			data = data;
		}
	}

	void insertAtBeg(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head.prev = node;
			head = node;
		}

	}

	void insertAtEnd(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			node.prev = temp;
		}
	}

	public static void main(String[] args) {

	}

}
