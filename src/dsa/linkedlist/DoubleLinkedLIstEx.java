package dsa.linkedlist;

public class DoubleLinkedLIstEx {
	static Node head;

	class Node {
		int data;
		Node prev;
		Node next;

		public Node(int data) {
			this.data = data;
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

	void reverse() {
		if (head == null || head.next == null)
			return;
		Node prev = null;
		Node next;
		Node temp = head;
		while (temp != null) {
			prev = temp.prev;
			temp.prev = temp.next;
			temp.next = prev;
			temp = temp.prev;

		}
		head = prev.prev;
		// System.out.println(head.data);
	}

	void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + ",");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DoubleLinkedLIstEx dl = new DoubleLinkedLIstEx();
		dl.insertAtBeg(8);
		dl.insertAtBeg(7);
		dl.insertAtBeg(6);
		dl.insertAtBeg(5);
		dl.insertAtBeg(4);
		dl.insertAtEnd(9);
		dl.insertAtEnd(10);
		dl.insertAtEnd(19);
		dl.print();
		dl.reverse();
		dl.print();

	}

}
