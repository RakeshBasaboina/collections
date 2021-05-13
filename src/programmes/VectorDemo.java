package programmes;

import java.util.Scanner;
import java.util.Vector;

public class VectorDemo {

	static Vector displayEvenNo(int startval, int Endval) {
		Vector<Integer> v = new Vector<>();
		for(int i =  startval; i <= Endval;i++) {
			if(i %2 == 0) {
				v.add(i);
				}
			}
		return v;
		
}

	public static void main(String[] args) {
		System.out.println(" Enter the start value");
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter end value ");
		int startvalue = sc.nextInt();
		int endvalue = sc.nextInt();
		VectorDemo d = new VectorDemo();
		Vector<Integer> v = d.displayEvenNo(startvalue, endvalue);
		v.forEach(x->System.out.println(x));
	   
		
		// TODO Auto-generated method stub

	}
}
