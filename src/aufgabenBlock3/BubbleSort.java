package aufgabenBlock3;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] zahlen = {42, 69, 420, 187, 1337, -5, 0};
//		bubblesort(zahlen);
		bubblesortOptimized(zahlen);
	}
	
	public static void bubblesortOptimized(int[] array) {
		boolean swapped = true;
		do {
			swapped = false;
			for(int i = 0; i < array.length -1; i++) {
				if(array[i] < array[i+1]) {
					swap(array, i, i+1);
					swapped = true;
				}
			}
		} while(swapped);
		printArr(array);
	}
	
	public static void bubblesort(int[] array) {
		for(int i = 1; i < array.length; i++) {
			for(int j = 0; j < array.length-i; j++) {
				if(array[j] < array[j+1]) {
					swap(array, j, j+1);
				}
			}
		}
		printArr(array);
	}
	
	private static void swap(int[] array, int a, int b) {
		int tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}
	
	
	private static void printArr(int[] arr) {
		System.out.println(Arrays.toString(arr).replaceAll("[\\[\\]]", ""));
		
	}

}
