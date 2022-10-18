package aufgabenBlock1;
import java.util.Scanner;

public class Mwst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Betrag: ");
		double value = sc.nextDouble();
		sc.close();
		System.out.format("""
				Geldbetrag:\t%.2f
				+MwSt.:\t\t%.2f
				-----------------------
				Gesamt:\t\t%.2f
				""", value, value*0.19, value*1.19);

	}

}
