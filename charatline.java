package snitsoft;

import java.io.PrintStream;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;


public class charatline {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner diskscanner = new Scanner(new File("email.txt"));
		PrintStream diskwrite = new PrintStream(new File("name.txt"));
		char symbol;
		
	    while (diskscanner.hasNext()) {
		symbol = diskscanner.findInLine(".").charAt(0);
		
		while (symbol != '@') {
			diskwrite.print(symbol);
			symbol = diskscanner.findInLine(".").charAt(0);
		}
		diskwrite.println();
	    }
	}

}
