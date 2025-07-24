package Lab02;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		System.out.println("run lab 2 bai 03");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so dien: ");
		int soDien = scanner.nextInt();
		int tienDien;
		if (soDien <= 100) {
			tienDien = soDien * 1000;
		} else {
			tienDien = 100 * 1000 + (soDien - 100) * 1500;
		}
		System.out.println("So tien dien = " + tienDien);

		scanner.close();
	}
}
