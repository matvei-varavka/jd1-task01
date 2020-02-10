package ee.htp.task01.linear;

public class Linear11_29 {
	public static void task11() {
		// 11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.
		
		double a = 9;
		double b = 3;
		double c = Math.sqrt(a * a + b * b);
		double perimeter = a + b + c;
		double area = 0.5 * (a * b);
		
		System.out.println("Perimeter is " + perimeter + "\n" + "Area is " + area);
	}
	public static void task12() {
		// 12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).
		
		double x_one = 2;
		double x_two = 4;
		double y_one = 3;
		double y_two = 5;
		double result = Math.sqrt(Math.pow(x_two - x_one, 2) + Math.pow(y_two - y_one, 2));
		
		System.out.println("Answer is " + result);
	}
	public static void task13() {
		// 13. Заданы координаты трех вершин треугольника (х1 у1),(х2, у2) ),(х3, у3). Найти его периметр и площадь.
		
		double x_one = -4;
		double y_one = -6;
		double x_two = -3;
		double y_two = 7;
		double x_three = 8;
		double y_three = -1;
		
		double one_two = Math.sqrt(Math.pow(x_two - x_one, 2) + Math.pow(y_two - y_one, 2));
		double two_three = Math.sqrt(Math.pow(x_three - x_two, 2) + Math.pow(y_three - y_two, 2));
		double one_three = Math.sqrt(Math.pow(x_three - x_one, 2) + Math.pow(y_three - y_one, 2));
		double perimeter = one_two + two_three + one_three;
		double det = (x_one - x_three) * (y_two - y_three) - (x_two - x_three) * (y_one - y_three);
		double area = Math.abs(det) / 2;
		
		System.out.println("Perimeter is " + perimeter + "\n" + "Area is " + area);
	}
	public static void task14() {
		// 14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
		
		double r = 15;
		double area = Math.PI * Math.pow(r, 2);
		double circ = 2 * (Math.PI * r);
		
		System.out.println("Circumference is " + circ + "\n" + "Area of a circle is " + area);
	}
	public static void task15() {
		// 15. Написать программу, которая выводит на экран первые четыре степени числа π.
		
		double pi_two = Math.pow((Math.PI), 2);
		double pi_three = Math.pow((Math.PI), 3);
		double pi_four = Math.pow((Math.PI), 4);
		double pi_five = Math.pow((Math.PI), 5);
		
		System.out.println("Pi in the second degree is " + pi_two + "\n" + "Pi in the third degree is " + pi_three
				+ "\n" + "Pi in the fourth degree is " + pi_four + "\n" + "Pi in the fifth degree is " + pi_five);
	}
	public static void task16() {
		// 16. Найти произведение цифр заданного четырехзначного числа.
		
		int number = 1726;
		int tho = number / 1000; /* 1 */
		int hun = number / 100 % 10; /* 4 */
		int ten = number / 10 % 10; /* 3 */
		int one = number % 10; /* 2 */
		int result = tho * hun * ten * one;
		
		System.out.println("Product of " + tho + " " + hun + " " + ten + " " + one + " is " + result);
		
	}
	public static void task17() {
		// 17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.
	
		double a = 2;
		double b = 3;
		double arithmetic = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		double geometric = Math.sqrt(Math.abs(a) * Math.abs(b));
		
		System.out.println("Arithmetic mean is " + arithmetic + "\n" + "Geometric mean is " + geometric);
	}
	public static void task18() {
		// 18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.
		
		double a = 4;
		double cube_face_area = Math.pow(a, 2);
		double cube_surface_area = 6 * cube_face_area;
		double cube_volume = Math.pow(a, 3);
		
		System.out.println("Cube face area is " + cube_face_area + "\n" + "Cube surface area is " + cube_surface_area
				+ "\n" + "Cube volume is " + cube_volume);
	}
	public static void task19() {
		/* 19. Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной
		и описанной окружностей. */
		
		double a = 3.5;
		double area = (Math.pow(a, 2) * Math.sqrt(3)) / 4;
		double height = (a + Math.sqrt(3)) / 2;
		double r_circumscribed = (a * Math.sqrt(3)) / 3;
		double r_inscribed = (a * Math.sqrt(3)) / 6;
		
		System.out.println("Area of a triangle is " + area + "\n" + "Height of a triangle is " + height
				+ "\n" + "Radius of a circumscribed is " + r_circumscribed 
				+ "\n" + "Radius of an inscribed circle is " + r_inscribed);
	}
	public static void task20() {
		// 20. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
		
		double circumference = 50;
		double diameter = circumference / Math.PI;
		double area = Math.PI * (Math.pow(diameter, 2) / 4);
		
		System.out.println("Area of a circle" + area);
	}
	public static void task21() {
		/* 21. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
		дробную и целую части числа и вывести полученное значение числа.*/
		
		double num = 222.999;
		double round = Math.floor(num);
		int wer = (int) round;
		double mult = num * 1000;
		int trans = (int) mult;
		int ans = trans - wer * 1000;
		
		System.out.println(ans + "." + wer);
	}
	public static void task22() {
		/* 22. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное
		значение длительности в часах, минутах и секундах в следующей форме:
		ННч ММмин SSc. */
		
		int t_sec = 123735;
		int hour = t_sec / 3600;
		int minut = (t_sec % 3600) / 60;
		int sec = t_sec % 60;
		if (hour < 10) {
			System.out.print("0");
		}
		System.out.print(hour + "h ");
		if (minut < 10) {
			System.out.print("0");
		}
		System.out.print(minut + "min ");
		if (sec < 10) {
			System.out.print("0");
		}
		System.out.print(sec + "sec");
	}
	public static void task23() {
		// 23. Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r).
		
		double r_small = 4;
		double r_big = 8;
		double area_ring = Math.PI * (r_small * r_small - r_big * r_big);
		
		System.out.println("Area of a ring is " + area_ring);
	}
	public static void task24() {
		// 24. Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а.
		
		double a = 8;
		double b = 4;
		double angle = 45;
		double grinrad = angle * Math.PI / 180;
		double area = ((a * a - b * b) / 4) * Math.tan(grinrad);
		
		System.out.println("Area is " + area);
	}
	public static void task25() {
		/* 25. Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с (предполагается,
		что а≠0 и что дискриминант уравнения неотрицателен). */
		
		double a = 1;
		double b = 6;
		double c = 10;
		double disc = Math.pow(b, 2) - 4 * a * c;
		double x_one = (-b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);
		double x_two = (-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);
		if (disc == 0) {
			System.out.println("There is no real solutions!");
		} else if (a == 0) {
			System.out.println("There is no solution");
		} else {
			System.out.println("First root is " + x_one + "\n" + "Second root is " + x_two);
			}
	}
	public static void task26() {
		// 26. Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у.
		
		double a = 13;
		double b = 20;
		double angle = 90;
		double grinrad = angle * Math.PI / 180;
		double area = 0.5 * (a * b) * Math.sin(grinrad);
		
		System.out.println("Area of a triangle is " + area);
	}
	public static void task27() {
		/*Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, 
		 * получить значение а8 за три операции и  а10 за четыре операции.
		 */
		
		int a = 7;
		int a_two = a * a;
		int a_four = a_two * a_two;
		int a_eight = a_four * a_four;
		int a_ten = a_eight * a_two;
		
		System.out.println(a_eight);
		System.out.println(a_ten);
	}
	public static void task28() {
		// 28. Составить программу перевода радианной меры угла в градусы, минуты и секунды.
		
		double rad = 3.3;
		double one = rad * (180 / Math.PI);
		int degree = (int) one;
		double two = (one - degree) * 60;
		int min = (int) two;
		double three = (two - min) * 60;
		int sec = (int) three;
		System.out.println(+degree + " Degrees " + min + " Minutes " + sec + " Seconds");
	}
	public static void task29() {
		// 29. Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.
		
		double a = 7;
		double b = 2;
		double c = 8;
		double cos_alfa = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c);
		double arc_alfa = Math.round(Math.acos(cos_alfa) / Math.PI * 180);
		double rad_alfa = arc_alfa * Math.PI / 180;
		double cos_beta = (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c);
		double arc_beta = Math.round(Math.acos(cos_beta) / Math.PI * 180);
		double rad_beta = arc_beta * Math.PI / 180;
		double cos_gamma = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
		double arc_gamma = Math.round(Math.acos(cos_gamma) / Math.PI * 180);
		double rad_gamma = arc_gamma * Math.PI / 180;
		double result_deg = arc_alfa + arc_beta + arc_gamma;
		if (result_deg == 180) {
			System.out.println("Angle Alfa is " + (int) arc_alfa + " deg. or " + rad_alfa + " rad.");
			System.out.println("Angle Beta is " + (int) arc_beta + " deg. or " + rad_beta + " rad.");
			System.out.println("Angle Gamma is " + (int) arc_gamma + " deg. or " + rad_gamma + " rad.");
		} else {
			System.out.println("Error! Check the calculation");
		}
	}

}
