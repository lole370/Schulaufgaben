package aufgabenBlock2;

import java.util.Scanner;

public class Quadratberechnung {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie eine Zahl ein: ");
		double number = sc.nextDouble();
		sc.close();
		System.out.format("Das quadrat der Zahl %.2f ist: %.2f", number, quadrat(number));

	}
	
	public static double quadrat(double number) {
		return number*number;
	}

}
