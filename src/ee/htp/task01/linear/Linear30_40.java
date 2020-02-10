package ee.htp.task01.linear;

public class Linear30_40 {
	public static void task30() {
		// 30. Три сопротивления R1 R2, и R3 соединены параллельно. Найдите
		// сопротивление соединения.

		double r_one = 12;
		double r_two = 15;
		double r_three = 20;
		double r_result = 1 / (1 / r_one + 1 / r_two + 1 / r_three);

		System.out.println("Connection resistance is " + r_result);
	}

	public static void task31() {
		/*
		 * 31. Составить программу для вычисления пути, пройденного лодкой, если ее
		 * скорость в стоячей воде v км/ч, скорость течения реки v1 км/ч, время движения
		 * по озеру t1 ч, а против течения реки — t2 ч.
		 */

		double v_still = 30;
		double v_stream = 5;
		double t_still = 1;
		double t_up_stream = 1.5;
		double s_result = t_still * v_still + t_up_stream * (v_still - v_stream);

		System.out.println("Distance is " + s_result);
	}

	public static void task32() {
		/*
		 * Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0
		 * ≤к ≤59). Какое время будут показывать часы через р ч q мин r с?
		 */

		int now_hours = 10; // (0 <= hours <= 24)
		int now_minutes = 30; // (0 <= minutes <= 59)
		int now_seconds = 30; // (0 <= seconds <= 59)
		int inter_hor = 13;
		int inter_min = 29;
		int inter_sec = 30;
		int nowin_sec = now_hours * 3600 + now_minutes * 60 + now_seconds; // текущее время в секундах.
		int interin_seconds = inter_hor * 3600 + inter_min * 60 + inter_sec; // заданный интервал в секундах.
		int total_sec = nowin_sec + interin_seconds; // общ. кол-во секунд.
		int after_hours = total_sec / 3600; // вычленение часов из секунд.
		int temp = total_sec - (after_hours * 3600);
		int after_minutes = temp / 60; // вычленение минут.
		int after_seconds = temp - (after_minutes * 60); // секунд.
		int twentyfourhours = 0; // задаем формат 24 часовой
		if (after_hours > 23) {
			temp = (after_hours / 24);
			twentyfourhours = after_hours - temp * 24;
		} else {
			twentyfourhours = after_hours;
		}
		System.out.println("Now is " + now_hours + " h " + now_minutes + " min " + now_seconds + " sec ");
		System.out.println("After " + inter_hor + " h " + inter_min + " min " + inter_sec + " sec ");
		System.out.println("Will be " + twentyfourhours + " h " + after_minutes + " min " + after_seconds + " sec ");
	}

	public static void task33() {
		// 33. Ввести любой символ и определить его порядковый номер, а также указать
		// предыдущий и последующий символы.

		char x = '&';
		int now = (int) x;
		int prev = (int) x - 1;
		int next = (int) x + 1;
		char ch_prev = (char) prev;
		char ch_next = (char) next;

		System.out.println("Number now is " + now + " previous number was " + prev + " next number will be " + next
				+ "\n" + "Symbol now is " + x + " previous symbol was " + ch_prev + " next symbol will be " + ch_next);
	}

	public static void task34() {
		/*
		 * 34. Дана величина А, выражающая объем информации в байтах. Перевести А в
		 * более крупные единицы измерения информации.
		 */

		double Byteis = 11104421; // (Max. 1048576) не дописал до логического конца.
		double kBytes = Byteis / 1024;
		double temp = Byteis % 1024;
		double mBytes = Byteis / (Math.pow(1024, 2));
		if (Byteis < 1024) {
			System.out.println((int) Byteis + " Bytes is " + kBytes + " KB");
		}
		if (Byteis == 1024) {
			System.out.println((int) Byteis + " Bytes is " + (int) kBytes + " KB");
		}
		if ((Byteis > 1024) && (Byteis < (Math.pow(1024, 2)))) {
			System.out.println((int) Byteis + " Byte is " + (int) kBytes + " KB and " + (int) temp + " Bytes");
		}
		if (Byteis == (Math.pow(1024, 2))) {
			System.out.println((int) Byteis + " Bytes is " + (int) mBytes + " MB");
		}
		if (Byteis > (Math.pow(1024, 2))) {
			System.out.println("Out of calculation");
		}
	}

	public static void task35() {
		// 35. Даны натуральные числа М и N. Вывести старшую цифру дробной части и
		// младшую цифру целой части числа M/N.

		int m = 4222;
		int n = 82;
		double answer = (double) m / n;
		int low_digit = (int) (answer % 10);
		int high_digit = (int) ((answer * 10) % 10);

		System.out.println("m / n = " + answer + "\n" + "The lower digit of integer part is " + low_digit + "\n"
				+ "The higher digit of fractional part is " + high_digit);
	}

	public static void task36() {
		// 36. Найти частное произведений четных и нечетных цифр четырехзначного числа.

		int num;
		int one;
		int two;
		int three;
		int four;
		int odd;
		int even;

		num = 3372;
		one = num / 1000;
		two = num / 100 % 10;
		three = num / 10 % 10;
		four = num % 10;
		odd = 1;
		even = 1;

		if (one % 2 == 0) {
			even = even * one;
		} else {
			odd = odd * one;
		}
		if (two % 2 == 0) {
			even = even * two;
		} else {
			odd = odd * two;
		}
		if (three % 2 == 0) {
			even = even * three;
		} else {
			odd = odd * three;
		}
		if (four % 2 == 0) {
			even = even * four;
		} else {
			odd = odd * four;
		}

		System.out.println("Произведение четных чисел " + even + "; произведение нечетных чисел " + odd);
		System.out.println("Частное четных и нечетных чисел " + (double) even / odd);
	}

	public static void task37() {
		/*
		 * Составить линейную программу, печатающую значение true, если указанное
		 * высказывание является истинным, и false — в противном случае:
		 */

		// 1. Целое число N является четным двузначным числом.

		int num1 = 2;
		if (num1 / 100 == 0 && num1 % 2 == 0) {
			System.out.print("True: ");
		} else {
			System.out.print("False: ");
		}
		// 2. Сумма двух первых цифр заданного четырехзначного числа равна сумме двух
		// его последних цифр.

		int num2 = 3415;
		int dig_one = num2 / 1000;
		int dig_two = num2 / 100 % 10;
		int dig_three = num2 / 10 % 10;
		int dig_four = num2 % 10;
		if (dig_one + dig_two == dig_three + dig_four) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		// 3. Сумма цифр данного трехзначного числа N является четным числом.

		int num3 = 348;
		int dig1 = num3 / 100;
		int dig2 = num3 / 10 % 10;
		int dig3 = num3 % 10;
		if ((dig1 + dig2 + dig3) % 2 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		// 4. Точка с координатами (х, у) принадлежит части плоскости, лежащей между
		// прямыми х = m, х = n (m < n).

		int x4 = 4;
		int n4 = 5;
		int m4 = 4;
		if (m4 > n4) {
			System.out.println(false);
		}
		if ((x4 >= m4) && (x4 <= n4)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		// 5. Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.

		int num5 = 116;
		int dig51 = num5 / 100;
		int dig52 = num5 / 10 % 10;
		int dig53 = num5 % 10;
		if (Math.pow(num5, 2) == Math.pow(dig51 + dig52 + dig53, 3)) {
			System.out.println(true); // правды никогда не будет, т.к числа, удовл. всем условиям НЕ существует.
		} else {
			System.out.println(false);

		}
		// 6. Треугольник со сторонами а,b,с является равнобедренным.

		double a = 11.5;
		double b = 111.5;
		double c = 1.5;
		if (a == b) {
			if (a != c) {
				System.out.println(true);
			}
		}
		if (b == c) {
			if (b != a) {
				System.out.println(true);
			}
		}
		if (a == c) {
			if (a != b) {
				System.out.println(true);
			}
		}
		if ((a == c) && (a == b)) {
			System.out.println("True, but this is equilateral triangle");
		}
		if ((a != c) && (a != b) && (b != c)) {
			System.out.println(false);
		}
		// 7. Сумма каких-либо двух цифр заданного трехзначного натурального числа N
		// равна третьей цифре.

		int seventh = 404;
		int sim_a = seventh / 100;
		int sim_b = seventh / 10 % 10;
		int sim_c = seventh % 10;
		if ((sim_a + sim_b) == sim_c) {
			System.out.println(true);
		} else if ((sim_a + sim_c) == sim_c) {
			System.out.println(true);
		} else if ((sim_b + sim_c) == sim_c) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		// 8. Заданное число N является степенью числа а (показатель степени может
		// находиться в диапазоне от 0 до 4).

		int n8 = 32;
		int a8 = 2;
		if ((n8 == 1) || (n8 == a8) || (n8 == a8 * a8) || (n8 == Math.pow(a8, 3)) || ((n8 == Math.pow(a8, 4)))) {
			System.out.print(true);
		} else {
			System.out.print(false);

		}
		// 9. График функции у = ах2 + bх+ с проходит через заданную точку с
		// координатами (m, n).

		double a9 = 1.0;
		double b9 = 3.0;
		double c9 = -4.0;
		double x9 = 1.0;
		double y9 = 1.0;
		if (y9 == a9 * x9 * x9 + b9 * x9 + c9) {
			System.out.print(true);
		} else {
			System.out.print(false);
		}
	}

	public static void task38() {
		/*
		 * 38. Для данных областей составить линейную программу, которая печатает true,
		 * если точка с координатами (х, у) принадлежит закрашенной области, и false — в
		 * противном случае:
		 */

		double x = 2;
		double y = 2;
		if ((y + Math.abs(x) <= 4) && (y >= 0)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		if ((y >= -3 && y <= 0 && x >= -4 && x <= 4) || (y <= 4 && y >= 0 && x >= -2 && x <= 2)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		if ((x * x + y * y <= 25) && y <= 0 && x >= 0 || (x * x + y * y <= 16) && y >= 0 && x >= 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

	public static void task39() {
		/*
		 * 39. Дано действительное число х. Не пользуясь никакими другими
		 * арифметическими операциями, кроме умножения, сложения и вычитания, вычислите
		 * за минимальное число операций:
		 */

		double x = -2;
		double answer = x * x * x * (2 * x - 3) + x * (4 * x - 5) + 6;

		System.out.println(answer);
	}

	public static void task40() {
		// 40. Дано значение х. Получить значения -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4х3.
		// Позаботьтесь об экономии операций.

		double x = 6;
		double first = 2 * x + 4 * x * x * x;
		double second = 3 * x * x;
		double answer_first = -first + second;
		double answer_second = first + second + 1;

		System.out.println(answer_first + " " + answer_second);
	}

}
