package aufgabenBlock1;
import java.util.Scanner;

public class SchoenerName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Name: ");
		String name = sc.nextLine();
		sc.close();
		String dash = "-";
		String lineDecor = "+"+dash.repeat(name.length())+"+";
		System.out.println(lineDecor);
		System.out.format("|%s|\n", name);
		System.out.println(lineDecor);

	}

}
