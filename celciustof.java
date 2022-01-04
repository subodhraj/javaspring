package snitsoft;
import java.util.Scanner;

public class celciustof {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double celcius, fahreinheit;
		boolean room;
		
		System.out.println("Enter the temperature in celsius:");
		celcius = sc.nextDouble();
		
		fahreinheit = ((9.0 / 5.0 * celcius) + 32.0);
		
		System.out.print("room temperature in fahreinheit is ");
		System.out.println(fahreinheit);
		room = fahreinheit >= 55;
		System.out.print("the temperature is higher than 55 degree fahreinheit ");
		System.out.println(room);		
		if(room) {
			System.out.println("the temperature is hot in the room");
		} else {
			System.out.println("the temperature is cold in the room");
		}
		}
	

}
