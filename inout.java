package snitsoft;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class inout {
	public static void main (String args[]) 
		throws FileNotFoundException {
			Scanner Ds = new Scanner(new File("raw.txt"));
			PrintStream Dw = new PrintStream("cook.txt");
			double unitprice, quantity, total;
			
			unitprice = Ds.nextDouble();
			quantity = Ds.nextInt();
			
			total = unitprice * quantity;
			
			Dw.println(total);
				
		
	}

}
