package com.course.javase;

public class Switching {

	static void switching(int period) {
		float amount = 10;
		float rate = 0.1f;
		switch (period) {
		case 2:
			amount = amount + rate;
		case 1:
			amount = amount + rate;
		}
		System.out.println(amount);
	}

	public static void main(String[] args) {
		switching(2);
	}
}
