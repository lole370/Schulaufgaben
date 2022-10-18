package aufgabenBlock1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fahrerlaubnis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie Ihr Alter ein: ");
		int age = sc.nextInt();
		sc.close();
		
		boolean nothing = age < 14;
		boolean auto = age >= 18;
		boolean mofa = age >= 14;
		boolean moped = age >= 16;
		
		List<String> allowed = new ArrayList<String>();
		allowed.add(nothing ? "Nichts" : "");
		allowed.add(auto ? "Auto" : "");
		allowed.add(mofa ? "Mofa" : "");
		allowed.add(moped ? "Moped" : "");
		allowed.removeIf(n -> (n.length() == 0));
		System.out.format("Erlaubt sind: %s", allowed.toString().replaceAll("[\\[\\]]", ""));

	}

}
