package ee.htp.task01.cycles;

import java.util.Scanner;

public class Cycles21_40 {

	public static void task25() {

		// 25. Требуется определить факториал числа, которое ввел пользователь.

		Scanner scan = new Scanner(System.in);

		int i;
		long sum;

		sum = 1;

		System.out.println("Введите число");
		int input = scan.nextInt();

		for (i = 1; i <= input; i++) {
			sum = sum * i;

		}
		if (input > 20) {
			System.out.println("Слишком большое число. Переполнение памяти. Результат не достоверен");
		} else {
			System.out.println(input + "! = " + sum);
		}
		scan.close();

	}

	public static void task26() {

		/*
		 * 26. Вывести на экран соответствий между символами и их численными
		 * обозначениями в памяти компьютера (Таблицу ASCII).
		 */

		int i;
		int num;

		num = 32;

		for (i = num; i <= 255; i++) {
			System.out.println(i + " = " + (char) i);
		}
	}

	public static void task27() {

		/*
		 * 27. Для каждого натурального числа в промежутке от m до n вывести все
		 * делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
		 */

		Scanner scan = new Scanner(System.in);

		int i;
		int j;

		System.out.println("Введите первое число.");
		int m = scan.nextInt();

		System.out.println("Введите второе число.");
		int n = scan.nextInt();

		for (i = m + 1; i < n; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.println("для числа " + i + " делителем является " + j);
				}
			}
			scan.close();
		}

	}

	public static void task28() {

	}

	public static void task29() {

	}

	public static void task30() {

	}

	public static void task31() {

	}

	public static void task32() {

	}

	public static void task33() {

	}

	public static void task34() {

	}

	public static void task35() {

	}

	public static void task36() {

	}

	public static void task37() {

	}

	public static void task38() {

	}

	public static void task39() {

	}

	public static void task40() {

	}
}