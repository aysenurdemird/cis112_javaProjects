package cis112_week08.lab;

/**
 * A node implementation for MyQueue and MyDeque.
 * 
 * @param <T>
 * 
 * @author bingol
 */
public class MyNode<T> {

	public T data;
	public MyNode<T> next;
	public MyNode<T> prev;

	public MyNode(T data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}

	@Override
	public String toString() {
		return "[NodeSLLS: value=" + data + "]";
	}

}
