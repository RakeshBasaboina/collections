package programmes;

import java.util.Scanner;
import java.util.Stack;

public class PalandromeStack {
	public static void main(String[] args) {
		String rs ="";
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter name for palindrome");
		String str = sc.nextLine();
		Stack s = new Stack();
		for (int i = 0; i < str.length(); i++) {
			s.push(str.charAt(i));
			
		}
		while(!s.isEmpty()) {
			rs = rs+s.pop();
		}
		if(str.equals(rs)) {
			System.out.println(" Given no is palindrome");

		}
		else {
			System.out.println(" Given no is not palindrome");
		}
	}
	}		
		

