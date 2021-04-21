package com.course.javase;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Bundles {

	static Locale locale = new Locale("en");
	static Locale locale_ptBR = new Locale("pt", "BR");
	static double price = 10.14F;

	static void inPortuguese() {
		// bundle and message format
		ResourceBundle bundle = ResourceBundle.getBundle("com.course.resources.messages", locale_ptBR);
		String pattern = bundle.getString("hello");
		String message = MessageFormat.format(pattern, "John");

		// number format
		NumberFormat nf = NumberFormat.getInstance(locale_ptBR);
		String formattedPrice = nf.format(price);

		System.out.println(message + " " + formattedPrice);
	}

	static void inEnglish() {
		ResourceBundle bundle = ResourceBundle.getBundle("com.course.resources.messages", locale);
		String pattern = bundle.getString("hello");
		String message = MessageFormat.format(pattern, "John");

		NumberFormat nf = NumberFormat.getInstance(locale);
		String formattedPrice = nf.format(price);

		System.out.println(message + " " + formattedPrice);
	}

	public static void main(String[] args) {
		inPortuguese();
		inEnglish();
	}
}
