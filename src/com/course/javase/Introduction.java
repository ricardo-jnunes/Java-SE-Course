package com.course.javase;

public class Introduction {

	static String title;
	static String _test = "1";
	// String 0teste = "aa";
	static String $a = "2";

	static int a = 2;

	boolean isTrue = 4 > 5;
	int age;

	static void read() {
		title = _test;
		System.out.println(title);
		int b = ++a;
		System.out.println(b + " a: " + a);
		a = 2;
		b = a++;
		System.out.println(b + " a: " + a);

	}

	static void math() {
		int oct = 0141, hex = 0x61; // 97

		int a = 11, b = 3;
		System.out.println(Math.round(a / b));

		double c = 11d, d = 3d;
		System.out.println(Math.round(c / d));
		double result = Math.round((double) c / d * 100) / 100D;
		System.out.println(result);
	}

	static void bitwise() {
		int a = 2;
		int b = ~a;
		System.out.println(b);
	}

	static void casing() {
		char a = 'a';
		/*
		 * if (a >= 'a' && a <= 'z') { a -= 32; } else { a += 32; }
		 */
		a = (a >= 'a' && a <= 'z') ? (a -= 32) : (a += 32);
		System.out.println(a);
	}

	static void whatIsPrinted() {
		int x = 1, y = 1, z = 0;
		if (x == y | x < ++y) {
			z = x + y;
		} else {
			z = 1;
		}
		System.out.println(z);
	}

	public static void main(String[] args) {
		casing();
	}
}
