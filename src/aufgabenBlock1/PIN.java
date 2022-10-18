package aufgabenBlock1;

public class PIN {

	public static void main(String[] args) {
		for(int i = 0; i <= 9999; i++) {
			System.out.format("%04d", i);
			if(i%3 == 0)
				System.out.print(" PIN darf nicht verwendet werden!");
			System.out.print("\n");
		}

	}

}
