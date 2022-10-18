package aufgabenBlock1;

import java.util.Scanner;

public class MaximumEinfach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie die erste Zahl ein: ");
		int num1 = sc.nextInt();
		System.out.print("Geben Sie die zweite Zahl ein: ");
		int num2 = sc.nextInt();
		System.out.print("Geben Sie die dritte Zahl ein: ");
		int num3 = sc.nextInt();
		sc.close();
		System.out.format("Das Maximum der Zahlen %d, %d und %d lautet: %d", num1, num2,num3, Math.max(num1, Math.max(num2, num3)));

	}

}
