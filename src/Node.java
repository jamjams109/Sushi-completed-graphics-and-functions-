// Name:
// Date:
// Per:
// AP Computer Science

// Represents a node of a doubly-linked list.
public class Node {
	private Object value;
	private Node previous;
	private Node next;
	
	public Node(Object v) {
		value = v;
		next = null;
		previous = null;
	}
	
	public Node(Object v, Node pr, Node nx) {
		value = v;
		previous = pr;
		next = nx;
	}
	
	public Object getValue() {
		return value;
	}
	
	public Node getPrevious() {
		return previous;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setValue(Object v) {
		value = v;
	}
	
	public void setPrevious(Node pr) {
		previous = pr;
	}
	
	public void setNext(Node nx) {
		next = nx;
	}
}
