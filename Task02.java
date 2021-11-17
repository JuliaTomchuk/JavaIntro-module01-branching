package by.jepam.module01.branching;

import java.util.Scanner;

//Найти max{min(a,b),min(c,d)}
public class Task02 {
	public static void main(String args[]) {
		double a = readFromConsole();
		double b = readFromConsole();
		double c = readFromConsole();
		double d = readFromConsole();

		double minFirst = (a <= b) ? a : b;

		double minSecond = (c <= d) ? c : d;

		if (minFirst > minSecond) {
			System.out.println("Максимальное значение равно " + minFirst);
		} else if (minFirst < minSecond) {

			System.out.println("Максимальное значение равно " + minSecond);
		} else {
			System.out.println("Значения равны ");
		}
	}

	public static double readFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число:");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Введите число:");
		}
		return sc.nextDouble();

	}
}