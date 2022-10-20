package aufgabenBlock2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LKWMaut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie die gefahrenen Kilometer ein: ");
		int distance = sc.nextInt();
		String envClass = " ";
		
		while (!"ABCDEF".contains(envClass)) {
			System.out.print("Geben Sie die gefahrenen Schadstoffklasse (A,B,C,D,E,F) ein: ");
			envClass = sc.next();
		}

		System.out.print("Geben Sie die Anzahl der Axen ein: ");
		int axis = sc.nextInt();
		sc.close();
		printMaut(distance, axis, envClass);

	}

	public static void printMaut(int distance, int axis, String envClass) {
		Map<String, Double[]> envClasses = new HashMap<String, Double[]>();
		envClasses.put("A", new Double[] { 12.5d, 13.1d });
		envClasses.put("B", new Double[] { 14.6d, 15.2d });
		envClasses.put("C", new Double[] { 15.7d, 16.3d });
		envClasses.put("D", new Double[] { 18.8d, 19.4d });
		envClasses.put("E", new Double[] { 19.8d, 20.4d });
		envClasses.put("F", new Double[] { 20.8d, 21.4d });
		double maut = distance * envClasses.get(envClass)[axis < 4 ? 0: 1];	
		System.out.format("Schadstoffklasse: %s, %d Achsen, %d Kilometer, -> %.2f Eurocent", envClass, axis, distance, maut);
	}

}
