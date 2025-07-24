package Lab03;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao 1 so nguyen: ");
		int n = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d \n", n, i, n * i);
		}
		scanner.close();
	}
}
