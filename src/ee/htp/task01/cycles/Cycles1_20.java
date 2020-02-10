package ee.htp.task01.cycles;

import java.util.Scanner;

public class Cycles1_20 {

	public static void task01() {

		// 1. Необходимо вывести на экран числа от 1 до 5.
		
		int i;

		for (i = 1; i <= 5; i++) {
			System.out.println(i);
		}

	}

	public static void task02() {

		// 2. Необходимо вывести на экран числа от 5 до 1.
		
		int i;

		for (i = 5; i >= 1; i--) {
			System.out.println(i);
		}

	}

	public static void task03() {

		// 3. Необходимо вывести на экран таблицу умножения на 3:
		
		int i;

		for (i = 1; i <= 10; i++) {
			System.out.println("3 x " + i + " = " + 3 * i);
		}

	}

	public static void task04() {

		/*
		 * 4. С помощью оператора while напишите программу вывода всех четных чисел в
		 * диапазоне от 2 до 100 включительно.
		 */

		int i;

		i = 2;

		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	public static void task05() {

		/*
		 * 5. С помощью оператора while напишите программу определения суммы всех
		 * нечетных чисел в диапазоне от 1 до 99 включительно.
		 */

		int i;

		i = 1;

		while (i <= 99) {
			if (i % 2 != 0) {
				System.out.println(i + i);
			}
			i++;
		}
	}

	public static void task06() {

		/*
		 * 6. Напишите программу, где пользователь вводит любое целое положительное
		 * число. А программа суммирует все числа от 1 до введенного пользователем
		 * числа.
		 */

		Scanner scan = new Scanner(System.in);

		int i;
		int sum;

		i = 1;
		sum = 0;

		System.out.println("Введите целое положительное число.");

		int input = scan.nextInt();

		while (i < input) {

			sum = sum + i;
			i++;
		}
		System.out.println("Сумма числ от 1 до " + input + " (не включительно) равна " + sum);

		scan.close();

	}

	public static void task07() {

		/*
		 * 7.Вычислить значения функции на отрезке [а,b] c шагом h:
		 */

		double a;
		double b;
		double x;
		double y;
		double h;

		a = 3.2;
		b = 6.4;
		h = 1;

		for (x = a; x <= b; x = x + h) {
			System.out.print("x = " + x + "; ");
			if (x > 2) {
				y = x;
				System.out.println("y = " + y);
			} else if (x <= 2) {
				y = -x;
				System.out.println("y = " + y);
			}
		}

	}

	public static void task08() {

		/*
		 * 8. Вычислить значения функции на отрезке [а,b] c шагом h:
		 */

		int a;
		int b;
		int c;
		double x;
		double y;
		double h;

		a = 15;
		b = 18;
		c = 1;
		h = 2.5;

		for (x = a; x <= b; x += h) {
			System.out.print("x = " + x + "; ");
			if (x == 15) {
				y = (x + c) * 2;
				System.out.println("y = " + y);
			} else if (x != 15) {
				y = (x - c) + 6;
				System.out.println("y = " + y);
			}
		}
	}

	public static void task09() {

		/*
		 * Задача 9. Найти сумму квадратов первых ста чисел
		 */

		int i;
		int sum;

		i = 1;
		sum = 0;

		for (i = 1; i < 101; i++) {
			sum = sum + i * i;

		}
		System.out.println(sum);
	}

	public static void task10() {

		/*
		 * 10. Составить программу нахождения произведения квадратов первых двухсот
		 * чисел.
		 */

		int i;
		long sum;

		i = 1;
		sum = 1;

		for (i = 1; i < 201; i++) {
			sum = sum * i * i;
		}
		System.out.println(sum);
		System.out.println("Переполнение памяти. Результат не достоверен");

	}

	public static void task11() {

		/*
		 * Задача 11. Составить программу нахождения разности кубов первых двухсот чисел
		 */

		int i;
		long diff;

		diff = 1;

		for (i = 2; i < 201; i++) {
			diff = diff - i * i * i;
		}
		System.out.println(diff);
	}

	public static void task12() {

		/*
		 * 12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n
		 * >1 Составьте программу нахождения произведения первых 10 членов этой
		 * последовательности.
		 */

		int a1;
		int a2;
		int i;

		a1 = 1;

		System.out.print(a1);

		for (i = 1; i < 11; i++) {
			a2 = 6 + a1;
			a1 = a2;
			System.out.print("; " + a2);
		}

		System.out.println();
	}

	public static void task13() {

		/*
		 * 13. Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с
		 * шагом 0.5.
		 */

		int a;
		int b;
		double x;
		double y;
		double h;

		a = -5;
		b = 5;
		h = 0.5;

		for (x = a; x <= b; x = x + h) {
			System.out.print("x = " + x + "; ");
			y = 5 - ((x * x) / 2);
			System.out.println("y = " + y);
		}

	}

	public static void task14() {

		// условие не понял

	}

	public static void task15() {

		// условие не понял

	}

	public static void task16() {

		// 16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).

		int i;
		int sum;
		long mult;

		sum = 1;
		mult = 1;

		for (i = 2; i < 11; i++) {
			sum = sum + i;
			mult = mult * sum;
		}
		System.out.println(mult);
	}

	public static void task17() {

		// 17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)

		int i;
		double a;
		int n;

		a = 2.2;
		n = 3;

		for (i = 1; i < n; i++) {
			a = a * (a + i);

		}
		System.out.println(a);

	}

	public static void task18() {

		/*
		 * 18. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
		 * модуль которых больше или равен заданному е. Общий член ряда имеет вид:
		 */

		int i;
		double row;
		double e;
		int n;
		double sum;

		row = 2;
		e = 0.4;
		n = 8;
		sum = 0;

		for (i = 1; i < n; i++) {
			row = Math.pow(-1, i - 1) / i;
			if (Math.abs(row) >= e) {
				sum = sum + row;
			}
		}

		System.out.println(sum);
	}

	public static void task19() {

		/*
		 * 19. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
		 * модуль которых больше или равен заданному е. Общий член ряда имеет вид:
		 */

		int i;
		double row;
		double e;
		int n;
		double sum;

		row = 0;
		e = 0.3;
		n = 19;
		sum = 0;

		for (i = 1; i < n; i++) {
			row = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
			if (Math.abs(row) >= e) {
				sum = sum + row;
			}
		}

		System.out.println(sum);
	}

	public static void task20() {

		/*
		 * 20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
		 * модуль которых больше или равен заданному е. Общий член ряда имеет вид:
		 */

		int i;
		double row;
		double e;
		double n;
		double sum;

		row = 0;
		e = 0.1;
		n = 1.2;
		sum = 0;

		for (i = 1; i < n; i++) {
			row = 1 / ((3 * n - 2) * (3 * n + 1));
			if (Math.abs(row) >= e) {
				sum = sum + row;
			}
		}

		System.out.println(sum);

	}
}
