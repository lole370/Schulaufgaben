package aufgabenBlock1;

import java.util.Scanner;

public class Fussball {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie Ihren Namen ein: ");
		String name = sc.nextLine();
		System.out.print("Geben Sie Ihren Tipp ein ('X:Y'): ");
		String tipp = sc.nextLine();
		System.out.print("Geben Sie Ihren Einsatz ein: ");
		int einsatz = sc.nextInt();
		sc.close();

		if (tipp.equals("2:3")) {
			System.out.format("Herzlichen Glückwunsch %s!\n", name);
			System.out.format(
					"mit Ihrem Tipp von 3:2 für das Spiel: FC Bayern München - Borussia Dortmund mit einem Einsatz von: %d € erzielen Sie einen Gewinn von: %d €",
					einsatz, einsatz * 3);
		} else {
			System.out.format(
					"""
							Schade %s!
							Sie haben verloren! Leider konnten Sie mit Ihrem Tipp von %s für das Spiel: FC Bayern München - Borussia Dortmund mit einem Einsatz von %d € keinen Gewinn erzielen!
							""",
					name, tipp, einsatz);
		}

	}

}
