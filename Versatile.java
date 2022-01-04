package snitsoft;

import java.util.Scanner;
public class Versatile {
	public static void main (String args[]) {
		Scanner price = new Scanner(System.in);
		double amount;
		
		
		System.out.println("Whats the price");
		amount = price.nextDouble();
		
		System.out.println("Whats the name");
		
		System.out.print("you entered ");
		System.out.println(amount);
		amount = amount + 25.00;
		System.out.println("after adding the 25 dollar we have the price" );
		System.out.println(amount);
	}   

}
