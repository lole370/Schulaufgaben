package aufgabenBlock2;

import java.util.Scanner;

public class Zylinderberechnung {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String calc = " ";
		while(!"UuGgMmOoVv".contains(calc)) {
			System.out.print("Geben Sie die gewünschte Rechnung ein (U, G, M, O, V): ");
			calc = sc.next();			
		}
		calc = calc.toUpperCase();
		int height = -1;
		while (height <= 0) {
			System.out.print("Geben Sie die Höhe ein (Größer oder gleich 0): ");
			 height = sc.nextInt();
		}
		int radius = -1;
		while (radius <= 0) {
			System.out.print("Geben Sie den Radius ein (Größer oder gleich 0): ");
			radius = sc.nextInt();
		}
		
		if(height/radius >= 10000)
			System.out.println("Ungünstige Werte");
		sc.close();
		
		switch (calc) {
		case "U": {
			printUmfang(radius);
			break;
		}
		case "G": {
			printGrundflaeche(radius);
			break;
		}
		case "M": {
			printMantel(radius, height);
			break;
		}
		case "O": {
			printOberflaeche(radius, height);
			break;
		}
		case "V": {
			printVolumen(radius, height);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + calc);
		}

	}
	
	public static void printUmfang(int radius) {
		System.out.println("Umfang: " + 2 * Math.PI * radius);
	}
	public static void printGrundflaeche(int radius) {
		System.out.println("Umfang: " + Math.PI * radius * radius);
	}
	public static void printMantel(int radius, int height) {
		System.out.println("Umfang: " + 2 * Math.PI * radius * height);
	}
	public static void printOberflaeche(int radius, int height) {
		System.out.println("Umfang: " + 2 * Math.PI * radius * (radius + height));
	}
	public static void printVolumen(int radius, int height) {
		System.out.println("Umfang: " + Math.PI * radius * radius * height);
	}

}
