package loopAndString_30;

public class Node {

	private int data;
	private Node next;

	public Node() {
		data = 0;
		next = null;

	}

	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}

class LinkedList {

	private int size;
	private Node start;

	public LinkedList() {
		size = 0;
		start = null;
	}

	public boolean isEmpty() {
		if (start == null)
			return true;
		else
			return false;
	}

	public int getListSize() {
		return size;
	}

	public void getList() {
		Node t;
		if (isEmpty())
			System.out.println("list is empty");
		else {
			t = start;

			for (int i = 0; i <= size; i++) {
				System.out.println(" " + t.getData());
				t = t.getNext();
			}
		}
	}

	public void insertAtFirst(int val) {

		Node n;
		n = new Node();
		n.setData(val);
		n.setNext(start);
		size++;
	}

	public void insertAtLast(int val) {

		Node n, t;
		n = new Node();
		n.setData(val);
		t = start;
		if (t == null)
			start = null;
		else {
			while (t.getNext() != null) {
				t = t.getNext();
				t.setNext(n);
			}
			size++;
		}
	}

	public void insertAtPosition(int val, int pos) {

		if (pos == 1)
			insertAtFirst(val);
		else if (pos == size + 1)
			insertAtLast(val);
		else if (pos > 1 && pos <= size) {
			Node n, t;
			n = new Node(val, null);
			t = start;
			for (int i = 1; i < pos - 1; i++) {
				t = t.getNext();
				n.setNext(t.getNext());
				t.setNext(n);
				size++;
			}
		} else
			System.out.println("Insertion is not possible at position " + pos);
	}

	public void deleteFirst() {

		if (start == null)
			System.out.println("List is already empty");
		else {
			start = start.getNext();
			size--;
		}
	}

	public void deleteLast() {

		if (start == null)
			System.out.println("List is already empty");
		else if (size == 1) {
			start = null;
			size--;
		} else {
			Node t;
			t = start;
			for (int i = 1; i < size - 1; i++) {
				t = t.getNext();
				t.setNext(null);
				size--;
			}
		}
	}
	public void deleteAtPosition(int pos) {
		
		if(start==null)
			System.out.println("List is empty");
		else if(pos<1 || pos>size)
			System.out.println("Invallid position");
		else if(pos==1)
			deleteFirst();
		else if(pos==size)
			deleteLast();
		else {
			
		}
	}

}

class Test {

	public static void main(String[] args) {

	}
}
