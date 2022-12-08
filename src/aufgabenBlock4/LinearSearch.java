package aufgabenBlock4;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 10, 20, -3, 18 };
		int pos = findInt(-3, array);
		System.out.println(pos);
	}

	public static Integer findInt(int a, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (a == array[i])
				return i;
		}
		return -1;
	}

}
