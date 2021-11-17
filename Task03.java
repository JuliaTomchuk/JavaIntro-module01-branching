package by.jepam.module01.branching;

//Даны три точки (x1,y1), (x2,y2),(x3,y3). Определить будут ли они расположены на одной прямой.
public class Task03 {
	public static void main(String args[]) {
		double x1 = 5;
		double y1 = 9;
		double x2 = 8;
		double y2 = -10;
		double x3 = 4;
		double y3 = 7;

		if (((x3 - x1) / (x2 - x1)) == ((y3 - y1) / (y2 - y1))) {
			System.out.println("Точки расположены на одной прямой ");
		} else {
			System.out.println("Точки расположены не на  одной прямой ");
		}
	}

}
