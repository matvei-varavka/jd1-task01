package ee.htp.task01.branching;

public class Branching1_20 {

	public static void task01() {

		/*
		 * 1. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести
		 * на экран цифру 7, в противном случае – цифру 8.
		 */

		double num1;
		double num2;

		num1 = 9.2;
		num2 = 10;

		if (num1 < num2) {
			System.out.println((int) 7);
		} else {
			System.out.println((int) 8);
		}

	}

	public static void task02() {

		/*
		 * 2. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести
		 * на экран слово «yes», в противном случае – слово «no»
		 */

		double num1;
		double num2;

		num1 = 25.4;
		num2 = 12.3;

		if (num1 < num2) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

	public static void task03() {

		/*
		 * 3. Составить программу сравнения введенного числа а и цифры 3. Вывести на
		 * экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».
		 */

		double a;
		short num1;

		a = 12;
		num1 = 12;

		if (a < num1) {
			System.out.println("yes");
		}
		if (a > num1) {
			System.out.println("no");
		}
		if (a == num1) {
			System.out.println("out of conditions");
		}

	}

	public static void task04() {

		// 4. Составить программу: равны ли два числа а и b?

		double num1;
		double num2;

		num1 = 13;
		num2 = 12;

		if (num1 != num2) {
			System.out.println(num1 + " и " + num2 + " Не равны");
		} else {
			System.out.println(num1 + " и " + num2 + " Равны");
		}

	}

	public static void task05() {

		// 5. Составить программу: определения наименьшего из двух чисел а и b.

		double a;
		double b;

		a = 131;
		b = 111;

		System.out.println("Заданные числа: " + a + " и " + b);

		if (a < b) {
			System.out.println(a + " Меньшее число");
		}
		if (a > b) {
			System.out.println(b + " Большее число");
		}
		if (a == b) {
			System.out.println(a + " и " + b + " равны");
		}

	}

	public static void task06() {

		// 6. Составить программу: определения наибольшего из двух чисел а и b

		double a;
		double b;

		a = 111;
		b = 121;

		System.out.println("Заданные числа: " + a + " и " + b);

		if (a < b) {
			System.out.println(b + " Большее число");
		}
		if (a > b) {
			System.out.println(a + " Меньшее число");
		}
		if (a == b) {
			System.out.println(a + " и " + b + " равны");
		}

	}

	public static void task07() {

		/*
		 * 7. Составить программу нахождения модуля выражения a*x*x + b*x + c при
		 * заданных значениях a, b, c и х
		 */

		double a;
		double b;
		double c;
		double x;
		double result;

		a = 11.1;
		b = 2.3;
		c = 13.7;
		x = 3;

		System.out.println("a * x * x + b * x + c");
		System.out.println("a = " + a + "; b = " + b + "; c = " + c + "; x = " + x);

		result = a * x * x + b * x + c;

		System.out.println("При заданных условиях, модуль выражения равен: " + Math.abs(result));
	}

	public static void task08() {

		/*
		 * 8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.
		 */

		double a;
		double b;
		double aPow;
		double bPow;

		a = 5;
		b = 6;
		aPow = a * a;
		bPow = b * b;

		System.out.println("a = " + a + "; b = " + b);
		System.out.println("Квадрат числа " + a + " равен " + aPow + ", квадрат числа " + b + " равен " + bPow);

		if (aPow < bPow) {
			System.out.println("Квадрат числа " + a + " ченьше чем квадрат числа " + b);

		}

		if (aPow > bPow) {
			System.out.println("Квадрат числа " + b + " ченьше чем квадрат числа " + a);

		}

		if (a * a == b * b) {
			System.out.println("Квадраты чисел " + a + " и " + b + " равны.");
		}

	}

	public static void task09() {

		/*
		 * 9. Составить программу, которая определит по трем введенным сторонам,
		 * является ли данный треугольник равносторонним.
		 */

		double side1;
		double side2;
		double side3;

		side1 = 12;
		side2 = 11;
		side3 = 11;

		if ((side1 != side2) || (side2 != side3)) {
			System.out.println(
					"Треугольник со сторонами " + side1 + " , " + side2 + " и " + side3 + " не равносторонний");
		} else {
			System.out.println("Tреугольник со сторонами " + side1 + " , " + side2 + " и " + side3 + " равносторонний");
		}

	}

	public static void task10() {

		/* 10. Составить программу, которая определит площадь какого круга меньше. */

		double radius1;
		double radius2;
		double area1;
		double area2;

		radius1 = 11;
		radius2 = 13;

		area1 = Math.PI * radius1 * radius1;
		area2 = Math.PI * radius2 * radius2;

		if (area1 < area2) {
			System.out.println("Площадь круга радиусом " + radius1 + " меньше, чем площадь круга радиусом " + radius2);
		}

		if (area1 > area2) {
			System.out.println("Площадь круга радиусом " + radius2 + " меньше, чем площадь круга радиусом  " + radius1);
		}
		if (area1 == area2) {
			System.out.println("Площади кругов равны.");
		}

	}

	public static void task11() {

		/*
		 * 11. Составить программу, которая определит площадь какого треугольника больше
		 */

		double a1, b1, c1, a2, b2, c2; // стороны треугольников
		double p1; // ф-ла Герона для первого треугольника
		double p2; // ф-ла Герона для второго треугольник
		double area1;
		double area2;

		a1 = 12;
		b1 = 12;
		c1 = 14;
		a2 = 13;
		b2 = 12;
		c2 = 14;

		p1 = (a1 + b1 + c1);
		p2 = (a2 + b2 + c2);
		area1 = Math.sqrt(p1 * (p1 - a1) * (p1 - b1) * (p1 - c1));
		area2 = Math.sqrt(p2 * (p2 - a2) * (p2 - b2) * (p2 - c2));

		if (area1 > area2) {
			System.out.println("Площадь треугольника со сторонами " + a1 + " , " + b1 + " и " + c1
					+ " больше, площади треугольника со сторонами " + a2 + " , " + b2 + " and " + c2);
		}

		if (area1 < area2) {
			System.out.println("Площадь треугольника со сторонами " + a2 + " , " + b2 + " and " + c2
					+ " больше, площади треугольника со сторонами " + a1 + " , " + b1 + " and " + c1);
		}
		if (area1 == area2) {
			System.out.println("Площади треугольников равны.");
		}

	}

	public static void task12() {

		/*
		 * 12. Даны три действительных числа. Возвести в квадрат те из них, значения
		 * которых неотрицательны, и в четвертую степень — отрицательные.
		 */

		double num1;
		double num2;
		double num3;
		double sign1;
		double sign2;
		double sign3;

		num1 = -2;
		num2 = -3;
		num3 = -4;

		sign1 = 0;
		sign2 = 0;
		sign3 = 0;

		if (num1 > 0) {
			sign1 = num1 * num1;
		} else if (num1 < 0) {
			sign1 = Math.pow(num1, 4);
		}
		if (num2 > 0) {
			sign2 = num2 * num2;
		} else if (num2 < 0) {
			sign2 = Math.pow(num2, 4);
		}
		if (num3 > 0) {
			sign3 = num3 * num3;
		} else if (num3 < 0) {
			sign3 = Math.pow(num3, 4);
		}
		System.out.println(sign1 + " , " + sign2 + " и " + sign3);

	}

	public static void task13() {

		/*
		 * 13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
		 * которая из точек находится ближе к началу координат.
		 */

		double x1;
		double y1;
		double x2;
		double y2;

		x1 = -3;
		y1 = -4;
		x2 = 4;
		y2 = 3;

		if (Math.abs(x1 + y1) < Math.abs(x2 + y2)) {
			System.out.println("Точка А, с координатами x1 = " + x1 + "; y1 = " + y1
					+ " расположена ближе к центру, чем точка В, с координатами x2 = " + x2 + " ; y2 = " + y2);
		}
		if (Math.abs(x1 + y1) > Math.abs(x2 + y2)) {
			System.out.println("Точка В, с координатами x2 = " + x2 + "; y2 = " + y2
					+ " расположена ближе к центру, чем точка А, с координатами x1 = " + x1 + " ; y1 = " + y1);
		}
		if (Math.abs(x1 + y1) == Math.abs(x2 + y2)) {
			System.out.println("Точка А, с координатами x1 = " + x1 + "; y1 = " + y1
					+ " и точка В, с координатами x2 = " + x2 + "; y2 = " + y2 + " равноудалены от центра.");
		}

	}

	public static void task14() {

		/*
		 * 14) Даны два угла треугольника (в градусах). Определить, существует ли такой
		 * треугольник, и если да, то будет ли он прямоугольным.
		 */

		double angle1;
		double angle2;
		double result;

		angle1 = 89;
		angle2 = 91;

		result = 180 - (angle1 + angle2);
		if (result > 0) {
			System.out.println("Да, такой треугольник существует.");
			if (result == 90) {
				System.out.println("Это прямоугольный треугольник.");
			}
		} else {
			System.out.println("Нет, такой треугольник не возможен.");
		}

	}

	public static void task15() {

		/*
		 * 15. Даны действительные числа х и у, не равные друг другу. Меньшее из этих
		 * двух чисел заменить половиной их суммы, а большее — их удвоенным
		 * произведением.
		 */

		double x;
		double y;

		x = 12;
		y = 14;

		if (x != y) {
			if (x < y) {
				x = (x + y) / 2;
				y = x * y * 2;
				System.out.println("Новые значения x = " + x + "; y = " + y);
			} else {
				y = (x + y) / 2;
				x = x * y * 2;
				System.out.println("Новые значения x = " + x + "; y = " + y);
			}
		}

		if (x == y) {
			System.out.println("Нарушено условие. Числа равны!");

		}
	}

	public static void task16() {

		/*
		 * 16. На плоскости ХОY задана своими координатами точка А. Указать, где она
		 * расположена (на какой оси или в каком координатном угле).
		 */

		double x;
		double y;

		x = 1;
		y = -1;

		if ((x == 0) && (y == 0)) {
			System.out.println("Точка А с координатами x = " + x + "; y = " + y + " находится в центре.");
		}
		if ((y == 0) && (x != 0)) {
			System.out.println("Точка А с координатами x = " + x + "; y = " + y + " находится на оси х.");
		}
		if ((x == 0) && (y != 0)) {
			System.out.println("Точка А с координатами x = " + x + "; y = " + y + " находится на оси у.");
		}
		if ((x > 0) && (y > 0)) {
			System.out.println("Точка А с координатами x = " + x + "; y = " + y + " находится в I четверти.");
		}
		if ((x < 0) && (y > 0)) {
			System.out.println("Точка А с координатами x = " + x + "; y = " + y + " находится в II четверти.");
		}
		if ((x < 0) && (y < 0)) {
			System.out.println("Точка А с координатами x = " + x + "; y = " + y + " находится в III четверти.");
		}
		if ((x > 0) && (y < 0)) {
			System.out.println("Точка А с координатами x = " + x + "; y = " + y + " находится в IV четверти.");
		}
	}

	public static void task17() {

		/*
		 * 17. Даны целые числа m, n. Если числа не равны, то заменить каждое из них
		 * одним и тем же числом, равным большему из исходных, а если равны, то заменить
		 * числа нулями.
		 */

		int m;
		int n;

		m = 9;
		n = 3;

		if (m == n) {
			m = 0;
			n = 0;
			System.out.println(n + " " + m);
		}

		if (m > n) {
			n = m;
			System.out.println(m + " " + n);
		}
		if (m < n) {
			m = n;
			System.out.println(n + " " + m);
		}

	}

	public static void task18() {

		// 18. Подсчитать количество отрицательных среди чисел а, b, с.

		double a;
		double b;
		double c;
		int count;

		a = 2.4;
		b = -2;
		c = -0.9;
		count = 0;

		if (a < 0) {
			count++;
		}

		if (b < 0) {
			count++;
		}

		if (c < 0) {
			count++;
		}
		System.out.println(count);

	}

	public static void task19() {

		// 19. Подсчитать количество положительных среди чисел а, b, с.

		double a;
		double b;
		double c;
		int count;

		a = 2.4;
		b = 2;
		c = -0.9;
		count = 0;

		if (a > 0) {
			count++;
		}

		if (b > 0) {
			count++;
		}

		if (c > 0) {
			count++;
		}
		System.out.println(count);

	}

	public static void task20() {
		// 20. Определить, делителем каких чисел а, b, с является число k.

		double a;
		double b;
		double c;
		double k;

		a = 1;
		b = 2;
		c = 1;
		k = 3;

		if (a % k == 0) {
			System.out.println("делитель для А.");
		}
		if (b % k == 0) {
			System.out.println("делитель для В.");
		}
		if (c % k == 0) {
			System.out.println("Делитель для С.");
		}
		if ((a % k != 0) && (b % k != 0) && (c % k != 0)) {
			System.out.println("Не является делителем для заданных чисел.");
		}

	}
}
