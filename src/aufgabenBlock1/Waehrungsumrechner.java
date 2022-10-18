package aufgabenBlock1;
import java.util.HashMap;
import java.util.Scanner;

public class Waehrungsumrechner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie den Wert in Euro ein: ");
		double value = sc.nextDouble();
		sc.close();
		int currCode = -1;
		while (currCode < 1 || currCode > 3) {
			System.out.print("Wählen Sie die Währung: (1: €, 2: $, 3:£)");
			currCode = sc.nextInt();
		}
		HashMap<Integer, Double> currConversion = new HashMap<Integer, Double>();
		currConversion.put(1, 1.0d);
		currConversion.put(2, 0.9557d);
		currConversion.put(3, 0.8955d);
		HashMap<Integer, String> currCodeStr = new HashMap<Integer, String>();
		currCodeStr.put(1, "€ ... obviously");
		currCodeStr.put(2, "$");
		currCodeStr.put(3, "£");
		System.out.format("%.2f € = %.2f %s", value, value * currConversion.get(currCode), currCodeStr.get(currCode));

	}

}
