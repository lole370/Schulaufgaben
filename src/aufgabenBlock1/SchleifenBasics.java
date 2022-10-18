package aufgabenBlock1;

public class SchleifenBasics {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Zahl: " + i);
		}
		for (int i = 5; i <= 101; i++) {
			System.out.println("Nach Zahl: " + i + " folgt: " + (i + 1));
		}
		for (int i = 1; i <= 1000; i++) {
			System.out.print(i);
			if (i != 1000)
				System.out.print(", ");
		}

	}

}
