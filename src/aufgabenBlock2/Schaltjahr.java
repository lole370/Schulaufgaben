package aufgabenBlock2;

import java.util.Scanner;

public class Schaltjahr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie eine Jahreszahl ein: ");
		int number = sc.nextInt();
		sc.close();
		System.out.println(isLeapYear(number) ? "Ist ein Schaltjahr" : "Ist kein Schaltjahr");

	}
	
	public static boolean isLeapYear(int year) {
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				}
				return false;
			}
			return true;
		}
		return false;
	}

}
