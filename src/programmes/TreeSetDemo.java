package programmes;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add(" rakesh");
		ts.add(" pramod kumar");
		ts.add(" rakesh");
		ts.add(" gautham");
		ts.forEach(System.out::println);
		
		
		

	}
}
