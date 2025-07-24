package Lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu cua mang: ");
		int size = scanner.nextInt();

		int[] a = new int[size];
		System.out.println("Nhap phan tu cua mang: ");
		for (int i = 0; i < size; i++) {
			a[i] = scanner.nextInt();
		}
		System.out.println("Phan tu cua mang: " + Arrays.toString(a));

//		Arrays.sort(a);
//		System.out.print("Cac phan tu cua mang sau khi sap xep: ");
//		for (int i : a) {
//			System.out.print(i + ",");
//		}
//		System.out.println("Phan tu cua mang: " + Arrays.toString(a));
//
//		System.out.println("\nPhan tu co gia tri min: " + a[0]);
//		System.out.println("Phan tu co gia tri max: " + a[size - 1]);

		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			max = Math.max(max, a[i]);
			min = Math.min(min, a[i]);
		}
		System.out.println("\nPhan tu co gia tri min: " + min);
		System.out.println("Phan tu co gia tri max: " + max);

		scanner.close();
	}
}
