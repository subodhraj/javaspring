package snitsoft;

import java.util.Scanner;

public class gumball {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int gumball;
		int kids;
		int perkids;
		
		System.out.println("how many kids? how many gumball");
		kids = sc.nextInt();
		gumball = sc.nextInt();
		perkids = gumball/kids;
		System.out.print("number of gumball for kids are ");
		System.out.println(perkids);
	}

}
