package aufgabenBlock1;
import java.util.Scanner;

public class EinfacheEingabe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Wie ist dein Name?");
		String name = sc.nextLine();
		System.out.println("Hallo " + name + "!");
		System.out.print("Was ist deine E-Mail Adresse? ");
		String email = sc.nextLine();
		System.out.print("Und wann wurdest du geboren? ");
		String dateOfBirth = sc.nextLine();
		sc.close();
		
		System.out.format("""
				Name: %s
				E-Mail: %s
				Geburtsdatum: %s
				""", name, email, dateOfBirth);

	}

}
