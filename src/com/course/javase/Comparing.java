package com.course.javase;

import com.course.javase.inheritance.Person;

public class Comparing {

	public static void main(String[] args) {
		Person p1 = new Person("John");
		Person p2 = new Person("Bob");
		Person p3 = p1;

		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));

	}
}
