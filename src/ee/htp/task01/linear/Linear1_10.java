package ee.htp.task01.linear;

public class Linear1_10 {
	public static void task01() {
		// 1.���� ��� �������������� ����� � � �. ��������� �� �����, ��������,
		// ������������ � �������.

		double a = 19;
		double b = 4;

		double add = a + b;
		double subt = a - b;
		double mult = a * b;
		double div = a / b;

		System.out.println(a + " + " + b + " is " + add + "\n" + a + " - " + b + " is " + subt + "\n" + a + " * " + b
				+ " is " + mult + "\n" + a + " / " + b + " is " + div);
	}

	public static void task02() {
		// 2.������� �������� �������: � = 3 + �.

		double a = 15;
		double c = 3 + a;

		System.out.println("c = " + c);
	}

	public static void task03() {
		// 3.������� �������� �������: z = 2 * x + ( y � 2 ) * 5.

		double x = 4;
		double y = 6;
		double z = 2 * x + (y - 2) * 5;

		System.out.println("z = " + z);
	}

	public static void task04() {
		// 4. ������� �������� �������: z = ( (a � 3 ) * b / 2) + c.

		int a = 2;
		int b = 4;
		int c = 6;
		int z = (a - 3) * b / 2 + c;

		System.out.println(z);
	}

	public static void task05() {
		// 5. ��������� �������� ���������� �������� ��������������� ���� �����.

		double a = 12;
		double b = 25;
		double c = (a + b) / 2;

		System.out.println("Average of " + a + " and " + b + " is " + c);
	}

	public static void task06() {
		/*
		 * 6. �������� ��� ��� ������� ������. � n ����� ������� 80 � ������. �������
		 * ������ ������ � m ������� �������, ���� � ������ ������� ������ �� 12 �.
		 * ������, ��� � �����?
		 */

		int n = 6;
		int m = 4;
		int small = 80 / n;
		int big = small + 12;
		int answer = big * m;

		System.out.println("In a " + m + " big cans is " + answer + " liters of milk");
	}

	public static void task07() {
		// 7. ��� �������������, ������ �������� � ��� ���� ������ �����. ����� �������
		// ��������������

		double a = 4;
		double b = a / 2;
		double s = a * b;

		System.out.println("Area is " + s);
	}

	public static void task08() {
		// 8.��������� �������� ��������� �� ������� (��� ���������� ���������
		// �������������� ��������):

		double a = 2;
		double b = 4;
		double c = 6;
		double result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

		System.out.println("Answer is " + result);
	}

	public static void task09() {
		// 9. ��������� �������� ��������� �� ������� (��� ���������� ���������
		// �������������� ��������):

		double a = 2;
		double b = 3;
		double c = 4;
		double d = 2;
		double result = (a / c) * (b / d) - ((a * b - c) / (c * d));

		System.out.println("Answer is " + result);
	}

	public static void task10() {
		// 10. ��������� �������� ��������� �� ������� (��� ���������� ���������
		// �������������� ��������):

		double x = 4;
		double y = 2;
		double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);

		System.out.println("Answer is " + result);
	}

}
