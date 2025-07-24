package Lab02;

import java.util.Scanner;

public class Bai02 {
	public static void giaiPhuongTrinhBacNhat(int a, int b) {
		System.out.printf("Giai phuong trinh bac nhat %dx + %d = 0\n", a, b);

		if (a == 0 && b == 0) {
			System.out.println("Phuong trinh vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("Phuong trinh vo nghiem");
		} else {
			float x = (float) (-b * 1.0 / a);
			System.out.println("Phuong trinh co nghiem: x = " + x);
		}
	}

	public static void main(String[] args) {
		System.out.println("run lab 2 bai 02");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a: ");
		int a = scanner.nextInt();
		System.out.println("Nhap b: ");
		int b = scanner.nextInt();
		System.out.println("Nhap c: ");
		int c = scanner.nextInt();
		System.out.printf("Giai phuong trinh bac 2: %dx^2 + %dx + %d = 0\n", a, b, c);
		if (a == 0) {
//			if (b == 0 && c == 0) {
//				System.out.println("Phuong trinh vo so nghiem");
//			} else if (b == 0 && c != 0) {
//				System.out.println("Phuong trinh vo nghiem");
//			} else {
//				float x = (float) (-c * 1.0 / b);
//				System.out.println("Phuong trinh co nghiem: x = " + x);
//			}
			giaiPhuongTrinhBacNhat(b, c);
		} else {
			float delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				float x = (float) (-b * 1.0 / (2 * a));
				System.out.printf("Phuong trinh co ghiem kep: x = %.3f", x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (b + Math.sqrt(delta)) / (2 * a);
				System.out.printf("Phuong trinh co 2 nghiem phan biet: x1 = %.3f" + " va x2 = %.3f", x1, x2);
			}
		}
		scanner.close();
	}
}
