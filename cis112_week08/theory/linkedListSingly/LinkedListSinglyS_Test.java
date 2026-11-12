package cis112_week08.theory.linkedListSingly;

public class LinkedListSinglyS_Test {

	public static void main(String[] args) {
//		nodeTest();

		NodeSLLS ll;
		ll = LinkedListSinglyS.createLinkedListSingly(4);
		System.out.println(ll);

		System.out.println("3:" + LinkedListSinglyS.search("3", ll));
		System.out.println("8:" + LinkedListSinglyS.search("8", ll));
	}


	private static void nodeTest() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		NodeSLLS a;
		NodeSLLS b;
		NodeSLLS x;

		a = new NodeSLLS("aa");
		System.out.println(a);
		b = new NodeSLLS("bb");
		System.out.println(b);
		x = b;
		System.out.println(x);
		b = a;
		System.out.println(b);
		// linked list
		a.next = x;
		b = new NodeSLLS("cc");
		x.next = b;
	}

}
