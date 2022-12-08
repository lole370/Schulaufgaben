package aufgabenBlock4;

public class ArrayPracticeAufgabe {

	public static void main(String[] args) {
		aufgabeDrei();

	}

	public static void aufgabeDrei() {
		int[] array = { 11, 12, 5, 7, 4, 1, -3, 8, -2 };
//		scuffed:
//		int maxA = 0, maxB = 0;
//		for (int i = 0; i < array.length; i++) {
//			if (array[i] > array[maxA]) {
//				maxA = i;
//			}
//		}
//		for (int i = 0; i < array.length; i++) {
//			if (array[i] > array[maxB] && maxA != i) {
//				maxB = i;
//			}
//		}
//		System.out.println(array[maxA] + " " + array[maxB]);

		// gut:
		if(array.length < 2) {
			System.out.println("Array zu klein");
			return;
		}
		int maxA = array[0];
		int maxB = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			int num = array[i];
			if (num > maxA) {
				maxA = num;
			} else if (num == maxA) {
				maxB = num;
			} else if (num > maxB) {
				maxB = num;
			}
		}

		System.out.println(maxA + " " + maxB);
	}

}
