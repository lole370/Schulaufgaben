package aufgabenBlock1;

import java.util.Scanner;

public class ForIntervall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Intervall: ");
		int intervall = sc.nextInt();
		System.out.print("Schrittweite: ");
		int schrittweite = sc.nextInt();
		sc.close();
		for(int i = 0; i < intervall; i=i+schrittweite) {
			System.out.println(i);
		}

	}

}
