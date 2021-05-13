package programmes;

import java.util.Collections;
import java.util.List;

public class ListSort {

	public static void main(String[] args) {
		System.out.println(sortIntList());

	}
 public  static List<Integer> sortIntList() {
		List <Integer> list = new ArrayList<>();
		list.add(1202);
		list.add(102);
		list.add(02);
		list.add(202);
		Collections.sort(list);
		return list;
}
}
