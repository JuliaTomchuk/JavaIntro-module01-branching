package by.jepam.module01.branching;

import java.util.Scanner;

//Вычислить значение функции f(x), если x<=3, то f(x)=Math.pow(x,2)- 3*x+9, если x>3 f(x) =1/((Math.pow(x,3)+6);
public class Task05 {
	public static void main(String[] args) {
		double x = readFromConsole();
		double result;
		if (x <= 3) {
			result = Math.pow(x, 2) - 3 * x + 9;

		} else {
			result = 1 / ((Math.pow(x, 3)) + 6);
		}
		System.out.println(result);
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
