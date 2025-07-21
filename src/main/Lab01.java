package main;

import java.util.Scanner;

public class Lab01 {
	public static void main(String[] args) {
		System.out.println("Run bai 01");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Student Name:");
		String name = scanner.nextLine();
		System.out.println("Score: ");
		float score = scanner.nextFloat();

		System.out.println(name + " co diem " + score);

		System.out.println("Run bai 02");

		System.out.println("Chieu dai: ");
		int leght = scanner.nextInt();
		System.out.println("Chieu rong: ");
		int width = scanner.nextInt();

		System.out.println("Chu vi = " + (leght + width) * 2);
		System.out.println("Dien tich = " + leght * width);
		System.out.println("Canh nho nhat = " + Math.min(leght, width));

		System.out.println("Run bai 03");

		System.out.println("Nhap canh: ");
		int edge = scanner.nextInt();
		System.out.println("The tich = " + edge * edge * edge);
		System.out.println("The tich = " + Math.pow(edge, 3));

		scanner.close();
	}
}
