package aufgabenBlock1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Strafzettel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Wie viel km/h sind Sie zu schnell gefahren?");
		int vel = sc.nextInt();
		int pos = -1;
		while(pos != 1 && pos != 2) {			
			System.out.print("Außerorts(1) oder innerorts(2)?");
			pos = sc.nextInt();
		}
		sc.close();
		if (pos == 1) {
			System.out.println(getStrafeAusserorts(vel));
		} else {
			System.out.println(getStrafeInnerorts(vel));
		}
		
	}
	
	public static String getStrafeAusserorts(int vel) {
		Map<Integer, String> strafeMap = new HashMap<Integer, String>();
		strafeMap.put(2, "20€");
		strafeMap.put(3, "40€");
		strafeMap.put(4, "60€");
		strafeMap.put(5, "100€; 1 Punkt");
		strafeMap.put(6, "150€; 1 Punkt; 1 Monat Fahrverbot möglich");
		
		strafeMap.put(7, "200€; 1 Punkt; 1 Monat Fahrverbot möglich");
		strafeMap.put(8, "200€; 1 Punkt; 1 Monat Fahrverbot möglich");
		
		strafeMap.put(9, "320€; 2 Punkte; 1 Monat Fahrverbot");
		strafeMap.put(10, "320€; 2 Punkte; 1 Monat Fahrverbot");
		
		strafeMap.put(11, "480€; 2 Punkte; 1 Monat Fahrverbot");
		strafeMap.put(12, "480€; 2 Punkte; 1 Monat Fahrverbot");
		
		strafeMap.put(13, "600€; 2 Punkte; 2 Monate Fahrverbot");
		strafeMap.put(14, "600€; 2 Punkte; 2 Monate Fahrverbot");
		
		strafeMap.put(15, "700€; 2 Punkte; 3 Monate Fahrverbot");
		strafeMap.put(16, "700€; 2 Punkte; 3 Monate Fahrverbot");
		
		if (vel > 70) {
			return strafeMap.get(16);
		}
		
		return strafeMap.get((vel + (vel%5) + 1) / 5);
	}
	public static String getStrafeInnerorts(int vel) {
		Map<Integer, String> strafeMap = new HashMap<Integer, String>();
		strafeMap.put(2, "30€");
		strafeMap.put(3, "50€");
		strafeMap.put(4, "70€");
		strafeMap.put(5, "115€; 1 Punkt");
		strafeMap.put(6, "180€; 1 Punkt; 1 Monat Fahrverbot möglich");
		
		strafeMap.put(7, "260€; 1 Punkt; 1 Monat Fahrverbot möglich");
		strafeMap.put(8, "260€; 1 Punkt; 1 Monat Fahrverbot möglich");
		
		strafeMap.put(9, "400€; 2 Punkte; 1 Monat Fahrverbot");
		strafeMap.put(10, "400€; 2 Punkte; 1 Monat Fahrverbot");
		
		strafeMap.put(11, "560€; 2 Punkte; 2 Monate Fahrverbot");
		strafeMap.put(12, "560€; 2 Punkte; 2 Monate Fahrverbot");
		
		strafeMap.put(13, "700€; 2 Punkte; 3 Monate Fahrverbot");
		strafeMap.put(14, "700€; 2 Punkte; 3 Monate Fahrverbot");
		
		strafeMap.put(15, "800€; 2 Punkte; 3 Monate Fahrverbot");
		strafeMap.put(16, "800€; 2 Punkte; 3 Monate Fahrverbot");
		
		if (vel > 70) {
			return strafeMap.get(16);
		}
		
		return strafeMap.get((vel + (vel%5) + 1) / 5);
	}

}
