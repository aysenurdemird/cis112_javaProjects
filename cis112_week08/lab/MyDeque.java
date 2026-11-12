package cis112_week08.lab;

/**
 * A deque implementation.
 * 
 * @param <T>
 * @author bingol
 */
public class MyDeque<T> implements DequeInterface<T> {

	MyNode<T> first;
	MyNode<T> last;
	int size;

	public MyDeque() {
		first = null;
		last = null;
		size = 0;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void enqueueFirst(T data) {
		
		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		MyNode<T> node1 = new MyNode<>(data);

		if(isEmpty()) {
			first = node1;
			last = node1;
		} else {
			node1.next = first;
			first.prev = node1;
			first = node1;
		}

		size++;

		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
	}

	@Override
	public void enqueueLast(T data) {
		
		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		MyNode<T> node1 = new MyNode<>(data);

		if(isEmpty()) {
			first = node1;
			last = node1;
		} else {
			last.next = node1;
			node1.prev = last;
			last = node1;
		}
		size++;

		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
	}

	@Override
	public T dequeueFirst() {
		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		if(isEmpty()) {
			throw new java.util.NoSuchElementException();
		}
		T tmpData = first.data;
		if(first.next != null) {
			first = first.next;
			first.prev = null;
		} else {
			first = null;
			last = null;
		}
		size--;
		return tmpData; // ~~fake~~

		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
	}

	@Override
	public T dequeueLast() {
		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		if(isEmpty()) {
			throw new java.util.NoSuchElementException();
		}
		T tmpData = last.data;
		if(last.prev != null) {
			last = last.prev;
			last.next = null;
		} else {
			first = null;
			last = null;
		}
		size--;
		
		 return tmpData; // ~~fake~~

		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
	}

	@Override
	public T peekFirst() {
		return first.data;
	}

	@Override
	public T peekLast() {
		return last.data;
	}

	@Override
	public String toString() {
		String s = "[MyDeque: first=" + first + ", last=" + last + ", size=" + size;
		s += ", " + traverseFirstToLast();
		return s + "]";
	}

	public String traverseFirstToLast() {
		String s = "traverseFirstToLast=[";
		MyNode<T> node = first;
		if (node != null) {
			s += node;
			node = node.next;
		}
		while (node != null) {
			s += ", " + node;
			node = node.next;
		}
		return s + "]";
	}

	public String traverseLastToFirst() {
		String s = "traverseLastToFirst=[";
		MyNode<T> node = last;
		if (node != null) {
			s += node;
			node = node.prev;
		}
		while (node != null) {
			s += ", " + node;
			node = node.prev;
		}
		return s + "]";
	}

}
