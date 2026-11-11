package cis112_week08.theory.linkedListSingly;

/**
 * Singly linked list of NodeSLLS's
 * 
 * @author bingol
 */
public class LinkedListSinglyS {

	NodeSLLS head = null;

	public LinkedListSinglyS() {
		head = null;
	}

	public static NodeSLLS createLinkedListSingly(int n) {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		NodeSLLS head;
		NodeSLLS current;
		NodeSLLS prev;
		head = new NodeSLLS("0");
		prev = head;
		for (int i = 1; i < n; i++) {
			current = new NodeSLLS("" + i);
			prev.next = current;
			prev = current;
		}
		return head;
	}

	@Override
	public String toString() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		if (head == null) {
			return "Stack empty";
		} else {
			StringBuffer sb = new StringBuffer();
			NodeSLLS current = head;
			while (current != null) {
				sb.append(">" + current);
				current = current.next;
			}
			return sb.toString();
		}
	}

	public static boolean search(String str, NodeSLLS ll) {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		NodeSLLS current = ll;
		while (current != null) {
			if (current.data.equals(str)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
}
