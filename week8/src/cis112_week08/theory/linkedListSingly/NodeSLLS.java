package cis112_week08.theory.linkedListSingly;

/**
 * Node for Singly linked list of String's (SLLS).
 * 
 * @author bingol
 */
public class NodeSLLS {

	public String data = null;
	public NodeSLLS next = null;

	public NodeSLLS(String s) {
		this.data = s;
	}

	@Override
	public String toString() {
//		return "[NodeSLLS: data=" + data + ", next=" + next + "]"; // recursive?
		return "[NodeSLLS: data=" + data + "]";
	}
	
	public String canonical() {
		return "[" + data + "]";
	}

}
