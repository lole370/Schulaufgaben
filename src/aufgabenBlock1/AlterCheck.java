package aufgabenBlock1;

import java.util.Scanner;

public class AlterCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie Ihr Alter ein: ");
		int alter = sc.nextInt();
		sc.close();
		if (alter >= 15 && alter <= 20) {
			System.out.println("Teilnahme erlaubt");
		} else {
			System.out.println("Teilnahme nicht erlaubt!");
		}

	}

}
