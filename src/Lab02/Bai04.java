package Lab02;

import java.util.Scanner;

public class Bai04 {
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

	public static void giaiPhuongTrinhBatHai(int a, int b, int c) {
		System.out.printf("Giai phuong trinh bac 2: %dx^2 + %dx + %d = 0\n", a, b, c);
		if (a == 0) {
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
	}

	public static void tinhTienDien(int a) {
		int tienDien;
		if (a <= 100) {
			tienDien = a * 1000;
		} else {
			tienDien = 100 * 1000 + (a - 100) * 1500;
		}
		System.out.println("So tien dien = " + tienDien);
	}

	public static void main(String[] args) {
		System.out.println(">>LUA CHON TINH NANG<<");
		System.out.println("++------------------++");
		System.out.println("|1. Giai phuong trinh bac nhat|");
		System.out.println("|2. Giai phuong trinh bac 2|");
		System.out.println("|3. Tinh so tien dien");
		System.out.println("|4. Ket thuc");
		System.out.println("++------------------++");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap lua chon cua ban: ");
		int value = scanner.nextInt();
		switch (value) {
		case 1:
			System.out.print("Nhap a: ");
			int a1 = scanner.nextInt();
			System.out.print("Nhap b: ");
			int b1 = scanner.nextInt();

			giaiPhuongTrinhBacNhat(a1, b1);
			break;
		case 2:
			System.out.print("Nhap a: ");
			int a = scanner.nextInt();
			System.out.print("Nhap b: ");
			int b = scanner.nextInt();
			System.out.print("Nhap c: ");
			int c = scanner.nextInt();
			giaiPhuongTrinhBatHai(a, b, c);
			break;
		case 3:
			System.out.println("Nhap so dien: ");
			int soDien = scanner.nextInt();
			tinhTienDien(soDien);
			break;
		default:
			System.out.println("Chuong trinh ket thuc");
			System.exit(0);

		}
	}
}
