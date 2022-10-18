package aufgabenBlock2;

import java.util.Scanner;

public class Restdivision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie die erste Zahl ein: ");
		int num1 = sc.nextInt();
		System.out.print("Geben Sie die zweite Zahl ein: ");
		int num2 = sc.nextInt();
		sc.close();
		if(num2 == 0) {
			System.out.println("Durch 0 teilen is nicht..");
			return;
		}
		System.out.format("%d / %d = %d Rest: %d", num1, num2, division(num1, num2), rest(num1,num2));
	}
	
	public static int division(int num1, int num2) {
		return num1/num2;
	}
	public static int rest(int num1, int num2) {
		return num1%num2;
	}
	

}
