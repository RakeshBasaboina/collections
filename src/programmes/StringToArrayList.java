package programmes;

import java.util.Arrays;
import java.util.Collections;

public class StringToArrayList {

public static void main(String[] args) {
		
		String[] atrarray = {"ashok","Reddy","kumar"};
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(atrarray));
		Object b[] = al.toArray() ;
		for(Object a : b) {
			System.out.println(a);
		}
		al.add("rakhi");
		al.add("kumar");
		
		al.add("rakhi reddy");
		
		al.add("rakesh........");
	    al.forEach(x->System.out.println(x));
		Collections.synchronizedList(al);
		al.forEach(System.out::println);
}
}
