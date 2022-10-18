package aufgabenBlock1;

public class Zahlenrechner {

	public static void main(String[] args) {
		int num2 = 2;
		int num4 = 4;
		int num92 = 92;
		
		int calc1 = 1 + 7 - 14 + num92;
		System.out.println("1 + 7 - 14 + 2 = " + calc1);
		double calc2 = 82 - 92.92 + 94.821 - num92;
		System.out.println("82 - 92.92 + 94.821 - 92 = " + calc2);
		double calc3 = num4 * 3 / 6.0;
		System.out.println("4 * 3 / 6.0 = " + calc3);
		int calc4 = (num2 - 8) * (8 + 9);
		System.out.println("(2 - 8) * (8 + 9) = " + calc4);
		double calc5 = 3.0 / num4;
		System.out.println("3.0 / 4 = " + calc5);
		double calc6 = 8.0 / num4 + 8 * 11;
		System.out.println("8.0 / 4 + 8 * 11 = " + calc6);
		double calc7 = 92 / 8.3 / num2;
		System.out.println("92 / 8.3 / 2 = " + calc7);
		int calc8 = 82 % num2;
		System.out.println("82 % 2 = " + calc8);
		int calc9 = 13 % num4;
		System.out.println("13 % 4 = " + calc9);
	}

}
