package cis112_week08.lab;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)

/**
 * Tests for MyDeque.
 * 
 * @author bingol
 */
class TS_MyDeque_jUnit {


	@Test
	void constractor() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyDeque<String> deque = new MyDeque<>();

		/**/System.out.println("constractor:" + deque);
		//
		String expected = "[MyDeque: first=null, last=null, size=0, traverseFirstToLast=[]]";
		String actual = deque.toString();
		assertEquals(expected, actual);
		//
		assertEquals(true, deque.isEmpty());
	}

	@Test
	void ef() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyDeque<String> deque = new MyDeque<>();

		deque.enqueueFirst("a");
		/**/System.out.println("ef:" + deque);
		//
		String expected = "[MyDeque: first=[NodeSLLS: value=a], last=[NodeSLLS: value=a], size=1, traverseFirstToLast=[[NodeSLLS: value=a]]]";
		String actual = deque.toString();
		assertEquals(expected, actual);
	}

	@Test
	void ef_df() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyDeque<String> deque = new MyDeque<>();

		deque.enqueueFirst("a");
		/**/System.out.println("ef:" + deque);

		x = deque.dequeueFirst();
		/**/System.out.println("df:" + deque + ", x=" + x);
		/**/System.out.println("isEmpty:" + deque.isEmpty());
		//
		String expected = "[MyDeque: first=null, last=null, size=0, traverseFirstToLast=[]]";
		String actual = deque.toString();
		assertEquals(expected, actual);
	}

	@Test
	void ef_dl() {
		System.out.println("\n" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyDeque<String> deque = new MyDeque<>();

		deque.enqueueFirst("a");
		/**/System.out.println("ef:" + deque);

		x = deque.dequeueLast();
		/**/System.out.println("df:" + deque + ", x=" + x);
		/**/System.out.println("isEmpty:" + deque.isEmpty());
		//
		String expected = "[MyDeque: first=null, last=null, size=0, traverseFirstToLast=[]]";
		String actual = deque.toString();
		assertEquals(expected, actual);
	}

	@Test
	void ef_ef() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyDeque<String> deque = new MyDeque<>();

		deque.enqueueFirst("a");
		/**/System.out.println("ef:" + deque);

		deque.enqueueFirst("b");
		/**/System.out.println("ef:" + deque);
		//
		String expected = "[MyDeque: first=[NodeSLLS: value=b], last=[NodeSLLS: value=a], size=2, traverseFirstToLast=[[NodeSLLS: value=b], [NodeSLLS: value=a]]]";
		String actual = deque.toString();
		assertEquals(expected, actual);
	}

	@Test
	void el() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyDeque<String> deque = new MyDeque<>();

		deque.enqueueLast("a");
		/**/System.out.println("el:" + deque);
		//
		String expected = "[MyDeque: first=[NodeSLLS: value=a], last=[NodeSLLS: value=a], size=1, traverseFirstToLast=[[NodeSLLS: value=a]]]";
		String actual = deque.toString();
		assertEquals(expected, actual);
	}

	@Test
	void el_df() {
		System.out.println("\n" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyDeque<String> deque = new MyDeque<>();

		deque.enqueueLast("a");
		/**/System.out.println("el:" + deque);

		x = deque.dequeueFirst();
		/**/System.out.println("df:" + deque + ", x=" + x);
		/**/System.out.println("isEmpty:" + deque.isEmpty());
		//
		String expected = "[MyDeque: first=null, last=null, size=0, traverseFirstToLast=[]]";
		String actual = deque.toString();
		assertEquals(expected, actual);
	}

	@Test
	void el_dl() {
		System.out.println("\n" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyDeque<String> deque = new MyDeque<>();

		deque.enqueueLast("a");
		/**/System.out.println("el:" + deque);

		x = deque.dequeueLast();
		/**/System.out.println("dl:" + deque + ", x=" + x);
		/**/System.out.println("isEmpty:" + deque.isEmpty());
		//
		String expected = "[MyDeque: first=null, last=null, size=0, traverseFirstToLast=[]]";
		String actual = deque.toString();
		assertEquals(expected, actual);
	}

	@Test
	void el_el() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyDeque<String> deque = new MyDeque<>();

		deque.enqueueLast("a");
		/**/System.out.println("el:" + deque);

		deque.enqueueLast("b");
		/**/System.out.println("el:" + deque);
		//
		String expected = "[MyDeque: first=[NodeSLLS: value=a], last=[NodeSLLS: value=b], size=2, traverseFirstToLast=[[NodeSLLS: value=a], [NodeSLLS: value=b]]]";
		String actual = deque.toString();
		assertEquals(expected, actual);
	}

	@Test
	void el_el_el() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyDeque<String> deque = new MyDeque<>();

		deque.enqueueLast("a");
		/**/System.out.println("el:" + deque);

		deque.enqueueLast("b");
		/**/System.out.println("el:" + deque);

		deque.enqueueLast("c");
		/**/System.out.println("el:" + deque);

		/**/System.out.println("tfl:" + deque.traverseFirstToLast());
		/**/System.out.println("tlf:" + deque.traverseLastToFirst());
		//
		String expected;
		String actual;
		expected = "traverseFirstToLast=[[NodeSLLS: value=a], [NodeSLLS: value=b], [NodeSLLS: value=c]]";
		actual = deque.traverseFirstToLast();
		assertEquals(expected, actual);
		//
		expected = "traverseLastToFirst=[[NodeSLLS: value=c], [NodeSLLS: value=b], [NodeSLLS: value=a]]";
		actual = deque.traverseLastToFirst();
		assertEquals(expected, actual);
	}

	@Test
	void pf_pl() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyDeque<String> deque = new MyDeque<>();

		deque.enqueueFirst("a");
		deque.enqueueFirst("b");
		/**/System.out.println(deque);
		/**/System.out.println("pf:" + deque.peekFirst());
		/**/System.out.println("pl:" + deque.peekLast());

		//
		String expected;
		String actual;
		expected = "b";
		actual = deque.peekFirst();
		assertEquals(expected, actual);
		//
		expected = "a";
		actual = deque.peekLast();
		assertEquals(expected, actual);
	}

}
