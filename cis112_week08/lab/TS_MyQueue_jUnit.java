package cis112_week08.lab;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)

/**
 * Tests for MyQueue.
 * 
 * @author bingol
 */
class TS_MyQueue_jUnit {

	@Test
	void constractor() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyQueue<String> queue = new MyQueue<>();

		/**/System.out.println("constractor:" + queue);
		//
		String expected = "[MyQueue head=null, tail=null, size=0, []]";
		String actual = queue.toString();
		assertEquals(expected, actual);
		//
		assertEquals(true, queue.isEmpty());
	}

	@Test
	void d() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyQueue<String> queue = new MyQueue<>();

		assertThrows(NoSuchElementException.class, () -> queue.dequeue());
	}

	@Test
	void e() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyQueue<String> queue = new MyQueue<>();

		queue.enqueue("a");
		/**/System.out.println("e:" + queue);
		//
		String expected = "[MyQueue head=[NodeSLLS: value=a], tail=[NodeSLLS: value=a], size=1, [[NodeSLLS: value=a]]]";
		String actual = queue.toString();
		assertEquals(expected, actual);
	}

	@Test
	void e_d() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyQueue<String> queue = new MyQueue<>();

		queue.enqueue("a");
		x = queue.dequeue();
		/**/System.out.println("e:" + queue + ", x=" + x);
		//
		String expected = "[MyQueue head=null, tail=null, size=0, []]";
		String actual = queue.toString();
		assertEquals(expected, actual);
	}

	@Test
	void e_d_d() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyQueue<String> queue = new MyQueue<>();

		queue.enqueue("a");
		x = queue.dequeue();
		assertThrows(NoSuchElementException.class, () -> queue.dequeue());
	}

	@Test
	void e_e() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyQueue<String> queue = new MyQueue<>();

		queue.enqueue("a");
		queue.enqueue("b");
		/**/System.out.println("e:" + queue);
		//
		String expected = "[MyQueue head=[NodeSLLS: value=a], tail=[NodeSLLS: value=b], size=2, [[NodeSLLS: value=a], [NodeSLLS: value=b]]]";
		String actual = queue.toString();
		assertEquals(expected, actual);
	}

	@Test
	void e_e_d() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyQueue<String> queue = new MyQueue<>();

		queue.enqueue("a");
		queue.enqueue("b");
		x = queue.dequeue();
		/**/System.out.println("e:" + queue + ", x=" + x);
		//
		String expected = "[MyQueue head=[NodeSLLS: value=b], tail=[NodeSLLS: value=b], size=1, [[NodeSLLS: value=b]]]";
		String actual = queue.toString();
		assertEquals(expected, actual);
	}

}
