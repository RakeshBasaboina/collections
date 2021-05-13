package programmes;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Hashtable <String,Integer> ht = new Hashtable<>();
		ht.put("java", 230);
		ht.put(".net", 239);
		ht.put("C++", 210);
		ht.put("Pytyon", 240);
		ht.put("jango", 230);
		Enumeration<String> e = ht.keys();

		  
	     while (e.hasMoreElements()) {

	         String key = e.nextElement();

	         System.out.println(key + ":" + ht.get(key));
	     }
			
		}

}
