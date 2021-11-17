package by.jepam.module01.branching;

//Заданы размеры прямоугольного отверстия (А,В) и размеры x, y, z кирпича. Определить пройдёт ли кирпич в отверстие.
public class Task04 {
	public static void main(String args[]) {
		double a = 70;
		double b = 5;
		double x = 10;
		double y = 5;
		double z = 15;
		double c = findArea(a, b);// площадь прямоугольного отверстия
		double d = findArea(x, y);// площадь первой стороны кирпича
		double e = findArea(x, z);// площадь второй стороны кирпича
		double f = findArea(y, z);// площадь третьей стороны кирпича

		if (c >= d || c >= e || c >= f) {
			System.out.println("Кирпич пройдёт");

		} else {
			System.out.println("Кирпич не пройдёт");
		}
	}

	public static double findArea(double a, double b) {
		return a * b;
	}

}
