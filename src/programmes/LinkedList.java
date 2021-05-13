package programmes;

public class LinkedList {

	public static void main(String[] args) {
		LinkedList< String> l = new LinkedList<String>();
		l.add("A");
		l.add("D");
		l.add("E");
		l.add("F");
		l.add("U");
		l.add("A");
		l.addFirst("100");
		l.addLast("1");
		System.out.println(l);
		l.removeFirst();
		l.removeLast();
	
		l.remove(4);
		System.out.println(l);
		String str = l.get(3);
		System.out.println(l);
		System.out.println("After operations"+l);
		

	}

}
