package Lab02;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		System.out.println("Run lab 02 bai 01");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a: ");
		int a = scanner.nextInt();
		System.out.println("Nhap b: ");
		int b = scanner.nextInt();

		System.out.printf("Giai phuong trinh bac nhat %dx + %d = 0\n", a, b);

		if (a == 0 && b == 0) {
			System.out.println("Phuong trinh vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("Phuong trinh vo nghiem");
		} else {
			float x = (float) (-b * 1.0 / a);
			System.out.println("Phuong trinh co nghiem: x = " + x);
		}
		scanner.close();
	}

}
