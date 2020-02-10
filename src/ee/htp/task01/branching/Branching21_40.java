package ee.htp.task01.branching;

import java.util.Scanner;

public class Branching21_40 {

	public static void task21() {

		/*
		 * 21. Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или
		 * девочка? Введи Д или М». В зависимости от ответа на экране должен появиться
		 * текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Кто ты: Мальчик или Девочка?");

		String choose = scanner.nextLine();

		switch (choose) {
		case "Д":
			System.out.println("Я люблю девочек!");
			break;

		case "М":
			System.out.println("Я люблю мальчиков!");
			break;

		default:
			System.out.println("Пожалуйста перезагрузи программу и введи М или Д");
			break;
		}
		scanner.close();

	}

	public static void task22() {

		/*
		 * 22. Перераспределить значения переменных х и у так, чтобы в х оказалось
		 * большее из этих значений, а в y - меньшее.
		 */

		double x;
		double y;
		double temp;

		x = 5;
		y = 6;
		temp = 0;
		System.out.println("Исходные значения x = " + x + "; y = " + y);

		if (x == y) {
			System.out.println("Числа равны");

		} else if (x < y) {
			temp = y;
			y = x;
			x = temp;
			System.out.println("Новые значения x = " + x + "; y = " + y);

		} else {
			System.out.println("Новые значения x = " + x + "; y = " + y);

		}
	}

	public static void task23() {

		/*
		 * 23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31,
		 * месяц — от 1 до 12). Если введены некорректные данные, то сообщить об этом.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Пожалуйста введите число");
		int day = scanner.nextInt();

		System.out.println("Пожалуйста введите месяц");
		int month = scanner.nextInt();

		if ((day < 1) || (day > 31)) {
			System.out.println("Некорректная дата. Перезагрузите программу и попробуйте снова");
		}
		if ((month < 1) || (month > 12)) {
			System.out.println("Некорректная дата. Перезагрузите программу и попробуйте снова");
		} else {
			System.out.println("Вы ввели " + day + " число, " + month + " месяц.");
			scanner.close();
		}
	}

	public static void task24() {

		/*
		 * 24. Составить программу, определяющую результат гадания на ромашке —
		 * «любит—не любит», взяв за исходное данное количество лепестков n.
		 */

		int n;

		n = 7;

		if (n % 2 != 0) {
			System.out.println("Любит!");

		} else {
			System.out.println("Не любит!");
		}
	}

	public static void task25() {

		/*
		 * 25. Написать программу — модель анализа пожарного датчика в помещении,
		 * которая выводит сообщение «Пожароопасная ситуация », если температура в
		 * комнате превысила 60° С.
		 */

		double temp;

		temp = 60;

		if (temp > 61) {
			System.out.println("Пожароопасная ситуация!");

		} else {
			System.out.println("Не играйте со спичками!");
		}
	}

	public static void task26() {

		/*
		 * 26. Написать программу нахождения суммы большего и меньшего из трех чисел.
		 */

		double a;
		double b;
		double c;
		double min;
		double max;
		double result;

		a = 1;
		b = 2;
		c = 3;
		min = 0;
		max = 0;
		result = 0;

		if (a < b) {
			max = b;
		} else {
			max = a;
		}
		if (c > max) {
			max = c;
		}
		if (a > b) {
			min = b;
		} else {
			min = a;
		}
		if (c < min) {
			min = c;
		}
		result = min + max;
		System.out.println("Сумма " + min + " и " + max + " равна " + result);
	}

	public static void task27() {

		/*
		 * 27. Найти max{min(a, b), min(c, d)}.
		 */

		double a;
		double b;
		double c;
		double d;
		double max;

		a = 4;
		b = 7;
		c = 3;
		d = 2;
		max = 0;

		max = Math.max(Math.min(a, b), Math.min(c, d));

		System.out.println(max);

	}

	public static void task28() {

		/*
		 * 28. Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не
		 * равно d, то найти max(d — a, d — b, d — c).
		 */

		double a;
		double b;
		double c;
		double d;
		double da;
		double db;
		double dc;
		double max;

		a = 3;
		b = 4;
		c = 2;
		d = 7;
		da = 0;
		db = 0;
		dc = 0;
		max = 0;

		if ((a == d) || (b == d) || (c == d)) {
			if (a == d) {
				System.out.println("a = d");
			} else if (b == d) {
				System.out.println("b = d");
			} else {
				System.out.println("c = d");
			}
		}

		if ((a != d) && (b != d) && (c != d)) {
			System.out.println("Ни одно число не равно d");
			da = Math.max(d, a);
			db = Math.max(d, b);
			dc = Math.max(d, c);

			if (da > db) {
				max = da;
			} else {
				max = db;
			}

			if (dc > max) {
				max = dc;
			}
			System.out.println("max (d-a, d-b, d-c) = " + max);
		}

	}

	public static void task29() {

		/*
		 * 29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они
		 * расположены на одной прямой.
		 */

		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;

		x1 = -3;
		y1 = -2;
		x2 = -1;
		y2 = -1;
		x3 = 3;
		y3 = 1;

		if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
			System.out.println("Точки с заданными координатами, лежат на одной прямой.");

		} else {
			System.out.println("Точки с заданными координатами, не лежат на одной прямой");
		}

	}

	public static void task30() {

		/*
		 * 30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и
		 * заменить их абсолютными значениями, если это не так.
		 */

		double a;
		double b;
		double c;

		a = 6;
		b = 4;
		c = 2;

		if ((a > b) && (b > c)) {
			a = a * 2;
			b = b * 2;
			c = c * 2;
			System.out.println("Удвоенные значения a = " + a + "; b = " + b + "; c = " + c);

		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
			System.out.println("Абсолютные значения а = " + a + "; b = " + b + "; c = " + c);
		}

	}

	public static void task31() {

		/*
		 * 31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
		 * Определить, пройдет ли кирпич через отверстие.
		 */

		double a;
		double b;
		double x;
		double y;
		double z;

		a = 12;
		b = 10;
		x = 111;
		y = 12;
		z = 10;

		if ((x <= a) && (y <= b) || (y <= a) && (x <= b)) {
			System.out.println("Кирпич с размерами " + x + "; " + y + "; " + z + " пройдет в отверстие размером " + a
					+ " на " + b);
		} else if ((x <= a) && (z <= b) || (z <= a) && (x <= b)) {
			System.out.println("Кирпич с размерами " + x + "; " + y + "; " + z + " пройдет в отверстие размером " + a
					+ " на " + b);
		} else if ((y <= a) && (z <= b) || (z <= a) && (y <= b)) {
			System.out.println("Кирпич с размерами " + x + "; " + y + "; " + z + " пройдет в отверстие размером " + a
					+ " на " + b);
		} else {
			System.out.println("Кирпич с размерами " + x + "; " + y + "; " + z + "не пройдет в отверстие размером " + a
					+ " на " + b);
		}

	}

	public static void task32() {

		/*
		 * 32. Написать программу, которая по заданным трем числам определяет, является
		 * ли сумма каких-либо двух из них положительной.
		 */

		double a;
		double b;
		double c;

		a = -2;
		b = 3;
		c = 0;

		if ((a + b) > 0) {
			System.out.println("Сумма а " + a + " и b " + b + " положительна.");
		} else if ((b + c) > 0) {
			System.out.println("Сумма b " + b + " и c " + c + " положительна.");
		} else if ((c + a) > 0) {
			System.out.println("Сумма c " + c + " и a " + a + " положительна.");
		} else if ((a == 0) && (b == 0) && (c == 0)) {
			System.out.println("Cyмма любых чисел равна 0.");
		} else if ((a + b) < 0 || (b + c) < 0 || (c + a) < 0) {
			System.out.println("Cyмма любых чисел не положительна.");
		}

	}

	public static void task33() {

		/*
		 * 33. Написать программу, которая по паролю будет определять уровень доступа
		 * сотрудника к секретной информации в базе данных. Доступ к базе имеют только
		 * шесть человек, разбитых на три группы по степени доступа. Они имеют следующие
		 * пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны
		 * модули баз В, С; 9455, 8997 — доступен модуль базы С.
		 */

		int password;

		password = 174;

		if ((password == 9583) || (password == 1747)) {
			System.out.println("Доступ к модулям A, B, C");
		} else if ((password == 3331) || (password == 7922)) {
			System.out.println("Доступ к модулям B, C");
		} else if ((password == 9455) || (password == 8997)) {
			System.out.println("Доступ к модулям B, C");
		} else {
			System.out.println("Доступ запрещен, введен неверный пароль!");
		}
	}

	public static void task34() {

		/*
		 * /* 34. Составить программу, реализующую эпизод применения компьютера в
		 * книжном магазине. Компьютер запрашивает стоимость книг, сумму денег,
		 * внесенную покупателем; если сдачи не требуется, печатает на экране «спасибо»;
		 * если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и
		 * указывает сумму сдачи; если денег недостаточно, то печатает сообщение об этом
		 * и указывает размер недостающей суммы.
		 */

		double cost;
		double cash;

		cost = 25;
		cash = 25;

		if (cost == cash) {
			System.out.println("Спасибо!");
		} else if (cost < cash) {
			System.out.println("Вoзьмите сдачу " + (cash - cost));
		} else if (cost > cash) {
			System.out.println("Необходимо добавить " + (cost - cash));
		}

	}

	public static void task35() {

		// 35. Вычислить число и месяц в невисокосном году по номеру дня.

		int x;

		x = 334;

		if ((x >= 1) && (x <= 31)) {
			System.out.println(x + " января");
		} else if ((x >= 32) && (x <= 59)) {
			System.out.println(x - 31 + " февраля");

		} else if ((x >= 60) && (x <= 90)) {
			System.out.println(x - 59 + " март");

		} else if ((x >= 91) && (x <= 120)) {
			System.out.println(x - 90 + " апрель");

		} else if ((x >= 121) && (x <= 151)) {
			System.out.println(x - 120 + " май");

		} else if ((x >= 152) && (x <= 181)) {
			System.out.println(x - 151 + " июнь");

		} else if ((x >= 182) && (x <= 212)) {
			System.out.println(x - 181 + " июль");

		} else if ((x >= 213) && (x <= 243)) {
			System.out.println(x - 212 + " август");

		} else if ((x >= 244) && (x <= 273)) {
			System.out.println(x - 243 + " сентябрь");

		} else if ((x >= 274) && (x <= 304)) {
			System.out.println(x - 273 + " октябрь");

		} else if ((x >= 305) && (x <= 334)) {
			System.out.println(x - 304 + " ноябрь");

		} else if ((x >= 335) && (x <= 365)) {
			System.out.println(x - 334 + " декабрь");
		}
	}

	public static void task36() {

		// 36. Вычислить значение функции:

		double x;
		double f;

		x = 5;
		f = 0;

		if (x <= 3) {
			f = x * x - 3 * x + 9;
			System.out.println(f);
		} else {
			f = 1 / Math.pow(x, 3) + 6;
			System.out.println(f);
		}
	}

	public static void task37() {

		// 37. Вычислить значение функции:

		double x;
		double f;

		x = 3;
		f = 0;

		if (x >= 3) {
			f = Math.pow(-x, 2) + 3 * x + 9;
			System.out.println(f);
		} else {
			f = 1 / Math.pow(x, 3) - 6;
			System.out.println(f);
		}
	}

	public static void task38() {

		// 38. Вычислить значение функции:

		double x;
		double f;

		x = -5;
		f = 0;

		if ((x >= 0) && (x <= 3)) {
			f = x * x;
			System.out.println(f);
		} else if ((x > 3) || (x < 0)) {
			f = 4;
			System.out.println(f);
		}
	}

	public static void task39() {

		// 39. Вычислить значение функции:

		double x;
		double f;

		x = 5;
		f = 0;

		if (x >= 8) {
			f = Math.pow(-x, 2) + x - 9;
			System.out.println(f);
		} else {
			f = 1 / (Math.pow(x, 4) - 6);
			System.out.println(x);
		}
	}

	public static void task40() {

		// 40. Вычислить значение функции:

		double x;
		double f;

		x = 14;
		f = 0;

		if (x <= 13) {
			f = Math.pow(-x, 3) + 9;
			System.out.println(f);
		} else {
			f = -3 / (x + 1);
			System.out.println(f);
		}
	}
}
