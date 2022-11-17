package aufgabenBlock3;

import java.util.Scanner;

public class ArrayAufgaben {

	public static void main(String[] args) {
		int[] messwerte = {248, 249, 251, 247, 250, 252, 246, 248, 249, 250};
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.print("Welche funktion wollen sie nutzen [a-g]? 'exit' um Programm zu beenden.");
			String input = sc.next();
			switch(input) {
			case "a":
				aufgabeA(messwerte);
				break;
			case "b":
				aufgabeB(messwerte);
				break;
			case "c":
				aufgabeC(messwerte);
				break;
			case "d":
				aufgabeD(messwerte);
				break;
			case "e":
				aufgabeE(messwerte);
				break;
			case "f":
				aufgabeF(messwerte);
				break;
			case "g":
				aufgabeG(messwerte);
				break;
			case "exit":
				run = false;
			
			}
		}
		sc.close();

	}
	
	public static void aufgabeA(int[] werte) {
		for(int i = 0; i < werte.length; i++) {
			System.out.format("%d\t%d\n", i+1, werte[i]);
		}
	}
	
	public static void aufgabeB(int[] werte) {
		int sum = 0;
		for(int v : werte) {
			sum += v;
		}
		System.out.println("Summe: " + sum);
	}
	
	public static void aufgabeC(int[] werte) {
		double sum = 0;
		for(int v : werte) {
			sum += v;
		}
		System.out.println("Summe: " + sum/werte.length);
	}
	
	public static void aufgabeD(int[] werte) {
		int abweichung = 0;
		for(int v : werte) {
			abweichung += Math.abs(250 - v);
		}
		System.out.println("Abweichung: " + abweichung);
	}
	
	public static void aufgabeE(int[] werte) {
		for(int i = 0; i < werte.length; i++) {
			if(245 < werte[i] && werte[i] < 250 ) {
				
				System.out.format("%d\t%d\n", i, werte[i]);
			}
		}
	}
	
	public static void aufgabeF(int[] werte) {
		for(int i = werte.length-1; i >= 0; i--) {
			System.out.format("%d\t%d\n", i+1, werte[i]);
		}
	}
	
	public static void aufgabeG(int[] werte) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int input = -1;
		while(run) {
			System.out.println("Liste aufsteigend (0) oder absteigend(1) ausgeben?");
			input = sc.nextInt();
			if(input == 1 || input == 0) {
				run = false;
			}
		}
		sc.close();
		werte = sortArray(werte);
		if(input == 1) {
			aufgabeA(werte);
		} else {
			aufgabeF(werte);
		}
	}

	public static int[] sortArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}
	

}
