package by.jepam.module01.branching;

import java.util.*;

//Даны два угла треугольника в градусах.Определить существует ли такой такой треугольник, если да, то определить является ли он прямоугольным.
public class Task01 {
	public static void main(String args[]) {
		double x = readFromConsole();
		double y = readFromConsole();
		if (180 - (x + y) == 90) {
			System.out.println("Треугольник существует и является прямоугольным");
		} else if ((x + y) < 180) {
			System.out.println("Треугольник существует");

		} else {
			System.out.println("Треугольник не существует");
		}
	}

	public static double readFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значение угла в градусах:");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Введите значение угла в градусах:");
		}
		return sc.nextDouble();
	}

}
