package com.course.javase;

public class Introduction {

	static String title;
	static String _test = "1";
	// String 0teste = "aa";
	static String $a = "2";

	static int a = 2;

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

	public static void main(String[] args) {
		bitwise();
	}
}
