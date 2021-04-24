package com.course.javase.inheritance;

import com.course.javase.definitions.Organism;

public abstract class Animal extends Organism {

	public String p = "init", q = "init";
	protected String a;
	String b;
	private String c;

	char ch = '\u0000';

	byte bity;
	byte bity1 = -128;
	// byte bity2 = 128;

	public void roar() {
		System.out.println("roarr");
	}
}
