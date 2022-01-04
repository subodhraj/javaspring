package snitsoft;

import java.util.Scanner;
import static java.lang.System.out;

public class agefordiscount {
	public static void main(String args[]) {
		Scanner dram = new Scanner(System.in);
		Scanner cram = new Scanner(System.in);
		int age;
		double price = 0.00;
		
		 		
		out.println("please enter your age: ");
		age = dram.nextInt();
		
		out.println("Do you have coupon y/n?");
		char apple = cram.next().charAt(0);
		
		System.out.println(apple);
		if (age >= 12 && age < 65) {
			price = 10.75;
			
		}
		if (age < 12 || age >=65 ) {
			price = 5.50;
		}
		
		if (( apple == 'y' || apple == 'Y') && (age >= 12 && age < 65)) {
			price -= 3.00;
		}
		
		System.out.print("your price is : ");
		System.out.println(price);
		
	}

}
