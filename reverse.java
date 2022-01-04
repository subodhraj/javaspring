package snitsoft;

import java.util.Scanner;

public class reverse {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char c1, c2, c3, c4;
		
		c1 = sc.findInLine(".").charAt(0);
		c2 = sc.findInLine(".").charAt(0);
		c3 = sc.findInLine(".").charAt(0);
		c4 = sc.findInLine(".").charAt(0);
		
		System.out.print(c4);
		System.out.print(c3);
		System.out.print(c2);
		System.out.print(c1);
		System.out.println( );
	}

}
