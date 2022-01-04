package snitsoft;

import java.util.Scanner;
import java.util.Random;
import static java.lang.System.out;

public class switchhero {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int mynumber;
		
		System.out.println("Enter random number between 1 to 4:");
		mynumber = sc.nextInt();
		
			
		switch(mynumber) {
		case 1:
			out.println("you press 1 and you are a clown");
			break;
			
		case 2:
			out.println("you press 2 and you are a stupid foo");
			break;
		case 3:
			out.println("you press 3 and you are free");
			break;
		case 4:
			out.println("you press 4 and you are chor ho");
			break;
		default:
			out.println("what is wrong with you..press a number between 1 to 4 stupid");
			break;
		}
		
		out.println("whatever you press doesnt matter you are only thing that still matter");
		}

}
