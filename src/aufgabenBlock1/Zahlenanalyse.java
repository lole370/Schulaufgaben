package aufgabenBlock1;

public class Zahlenanalyse {

	public static void main(String[] args) {
		for(int i = 0; i <= 200; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.format("#%d#", i);
			} else {
				System.out.print(i);
			}
			
			if(i % 2 == 0) {
				System.out.print("g");
			} else {
				System.out.print("u");				
			}
			
			if(i % 10 == 0) {
				System.out.print(" Zehnerzahl");
			}
			
			if (i % 7 != 0) {
				System.out.print(" (nT7)");				
			}
			
			System.out.println();
		}

	}

}
