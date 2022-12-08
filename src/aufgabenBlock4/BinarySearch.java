package aufgabenBlock4;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { -3, 2, 14, 23, 30, 40, 70 };
		// search 2
		System.out.println(binaraySearch(0, array));

	}

	public static Integer binaraySearch(int goal, int[] array) {
		int i = 0;
		int j = array.length-1;
		int m;
		while (i <= j) {
			m = (i + j) / 2;
			if (array[m] == goal) {
				return m;
			}
			if (goal < array[m]) {
				j = m - 1;
			} else {
				i = m + 1;
			}
		}

		return -1;
	}

}
