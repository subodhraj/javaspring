package snitsoft;

import java.util.Random;

public class whileloop {
	public static void main(String args[]) {
		Random r = new Random();
		
		int d1 = 0, d2 = 0;
		
		while (d1 + d2 != 12 && d1 + d2 != 2) {
			d1 = r.nextInt(6) +1;
			d2 = r.nextInt(6) +1;
			
			System.out.print(d1);
			System.out.print(" and ");
			System.out.println(d2);
					}
		System.out.print(d1 + d2);
		System.out.println(" Rolled successfully");
	}

}
