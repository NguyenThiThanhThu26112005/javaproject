package Lab03;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao 1 so nguyen: ");
		int n = scanner.nextInt();

		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println("Uoc so: " + i);
				count++;

			}

		}
		if (count != 0) {
			System.out.println("Day khong la so nguyen to");

		} else {
			System.out.println("Day  la so nguyen to");
		}

		scanner.close();

	}
}
