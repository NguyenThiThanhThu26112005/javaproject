package main;

import java.util.Arrays;

public class Loop {
	public static void main(String[] args) {
//		String[] clubs = { "Mu", "Man", "Liver" };
//
//		clubs[0] = "VietNam";
//
//		System.out.println("run here array with length " + clubs[0]);
//		System.out.println("run here array with length " + clubs[1]);
//		System.out.println("run here array " + Arrays.toString(clubs));
//
//		String[] a = new String[5];
//		a[0] = "1";
//		System.out.println("run here array: " + a[0]);
//
//		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
//		for (int i = 0; i < cars.length; i++) {
//			System.out.println(cars[i]);
//		}
//		System.out.println(cars);
//		System.out.println(Arrays.toString(cars));
//		Arrays.sort(cars);
//		System.out.println(Arrays.toString(cars));

		int[] clubs = { 5, 6, 8, 3, 1, 7 };
		for (int i = 0; i < clubs.length - 1; i++) {
			for (int j = i + 1; j < clubs.length; j++) {
				if (clubs[i] < clubs[j]) {
					int temp = clubs[i];
					clubs[i] = clubs[j];
					clubs[j] = temp;
				}
			}
		}
		System.out.println("run here array " + Arrays.toString(clubs));

	}

}
