package aufgabenBlock1;
import java.util.Scanner;

public class Summenrechner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Erste Zahl: ");
		double val1 = sc.nextDouble();
		System.out.print("Zweite Zahl: ");
		double val2 = sc.nextDouble();
		sc.close();
		System.out.format("Die Summe aus %f und %f beträgt: %f", val1, val2, val1+val2);
	}

}
