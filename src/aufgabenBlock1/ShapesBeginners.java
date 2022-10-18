package aufgabenBlock1;
import java.util.Scanner;

public class ShapesBeginners {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Länge: ");
		int length = sc.nextInt();
		if (length < 6) {
			System.out.println("no");
		} else {
			String seperator = "-";
			printTree(length);
			System.out.println("\n" + seperator.repeat(length) + "\n");
			printHourglass(length);
			System.out.println("\n" + seperator.repeat(length) + "\n");
			printTriangle(length);
		}
		sc.close();
	}

	public static String getCenteredStarLine(int lineLength, int numOfStars) {
		String line = "";
		for (int j = 0; j < (lineLength - numOfStars) / 2; j++) {
			line += " ";
		}
		for (int j = 0; j < numOfStars; j++) {
			line += "*";
		}
		line += "\n";
		return line;
	}

	public static void printTree(int len) {
		for (int i = 1; i < len; i += 2) {
			System.out.print(getCenteredStarLine(len, i));
		}
		System.out.print(getCenteredStarLine(len, 3));
		
	}

	public static void printHourglass(int size) {
		int lastLineLen = 0;
		for (int i = size; i > 0; i -= 2) {
			System.out.print(getCenteredStarLine(size, i));
			lastLineLen = i;
		}
		for (int i = lastLineLen+2; i < size+1; i += 2) {
			System.out.print(getCenteredStarLine(size, i));
			
		}
	}
	
	public static void printTriangle(int size) {
		System.out.print(getCenteredStarLine(size, size));
		for (int i = size-2; i > 0; i -= 2) {
			String line = getCenteredStarLine(size, i);
			char[] lineArr = line.toCharArray();
			lineArr[line.indexOf("*")] = '+';
			lineArr[line.lastIndexOf("*")] = '+';
			line = new String(lineArr);
			line = line.replace('*', ' ');
			line = line.replace('+', '*');
			System.out.print(line);
		}
	}
}
