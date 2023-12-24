package dsa.linkedlist;

public class LinkedListEx {
	static Node head;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
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

		}
	}

	void insertAtBeg(int data) {
		Node node = new Node(data);
		if (head == null) {
			// node = head;
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}

	void insertAtIndex(int pos, int data) {
		Node node = new Node(data);
		if (pos == 1) {
			node.next = head;
			head = node;
		} else {
			int i = 1;
			Node temp = head;
			while (temp != null && i < pos) {
				i++;
				if (i == pos) {
					node.next = temp.next;
					temp.next = node;
					break;
				}
				temp = temp.next;

			}
		}
	}

	void deleteAtFirst() {
		if (head == null) {
			System.out.println("no data");
		} else {
			Node temp = head;
			head = temp.next;
			temp.next = null;
		}
	}

	void deleteAtLast() {
		if (head == null) {
			System.out.println("no data");
		} else if (head.next == null) {
			head = null;
		} else {
			Node temp = head;
			while (temp != null) {
				temp = temp.next;
				if (temp.next.next == null) {
					temp.next = null;
					break;
				}
			}
		}
	}

	void deleteAtIndex(int pos) {
		if (pos == 1) {
			deleteAtFirst();
		} else {
			Node temp = head;
			int i = 1;
			while (temp != null && i < pos) {
				i++;
				if (i == pos) {
					temp.next = temp.next.next;
				}
				temp = temp.next;

			}
		}
	}

	void printList() {
		if (head == null) {
			System.out.println("mpty");
		} else {
			Node temp = head;

			while (temp != null) {
				System.out.print(temp.data + ",");
				temp = temp.next;
			}
		}
	}

	void recursive(Node node) {
		if (node == null) {
			return;
		}

		System.out.println(node.data);
		recursive(node.next);

	}

	public static void main(String[] args) {

		LinkedListEx ll = new LinkedListEx();
		ll.insertAtBeg(2);
		ll.insertAtBeg(4);
		ll.insertAtBeg(5);
		ll.insertAtBeg(6);
		ll.insertAtBeg(7);
		ll.insertAtBeg(8);
		ll.insertAtEnd(1);
		ll.insertAtIndex(6, 3);
		ll.deleteAtLast();
		ll.deleteAtFirst();
		ll.deleteAtIndex(3);
		ll.recursive(head);
		ll.printList();

	}

}
