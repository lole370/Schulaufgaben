package aufgabenBlock1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teiler {

	public static void main(String[] args) {
		System.out.println("Dieses Programm findet alle Teiler einer Zahl.");
		System.out.println("==============================================");
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie bitte eine ganze Zahl ein: ");
		int number = sc.nextInt();
		sc.close();
		List<Integer> teiler = new ArrayList<Integer>();
		for(int i = 2; i < number; i++) {
			if(number % i == 0)
				teiler.add(i);
		}
		if(teiler.isEmpty()) {			
			System.out.format("%d ist eine Primzahl!", number);
		} else {
			System.out.format("Die Teiler von %d sind: \n", number);
			System.out.println(teiler.toString().replaceAll("[\\[\\]]", ""));
			
		}
	}

}
