package aufgabenBlock1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Primfaktoren {

	public static void main(String[] args) {
		System.out.println("Dieses Programm findet (relativ ineffizient) die Primfaktorzerlegung einer Zahl");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie bitte eine ganze Zahl ein: ");
		long number = sc.nextLong();
		sc.close();
		if(number == 1) {
			System.out.println("1 lässt sich nicht in Primfaktoren zerlegen. (Du Lappen)");
			return;
		}
		if(isPrime(number)) {
			System.out.format("Die Primfaktoren von %d sind: \n", number);
			System.out.println(number);
		}
		List<Long> primTeiler = new ArrayList<Long>();
		List<Long> teiler = getTeiler(number);
		for (long i : teiler) {
			if(isPrime(i)) {
				primTeiler.add(i);
			}
		}
		List<Long> primFaktoren = new ArrayList<Long>();
		long workingNumber = number;
		while(workingNumber != 1) {
			for(long i : primTeiler) {
				if (workingNumber % i == 0) {
					primFaktoren.add(i);
					workingNumber = workingNumber / i;
				}
			}
		}
		System.out.format("Die Primfaktoren von %d sind: \n", number);
		Collections.sort(primFaktoren);
		System.out.println(joinList(primFaktoren, " * "));
	}

	public static List<Long> getTeiler(long number) {
		List<Long> teiler = new ArrayList<Long>();
		for (long i = 2; i < number; i++) {
			if (number % i == 0)
				teiler.add(i);
		}
		return teiler;
	}

	public static boolean isPrime(long number) {
		return getTeiler(number).isEmpty();
	}
	
	public static String joinList(List<Long> list, String joiner) {
		String result = "";
		for (Object object : list) {
			result = result + object + joiner;
		}
		result = result.substring(0, result.length() - joiner.length());
		return result;
	}
	

}
