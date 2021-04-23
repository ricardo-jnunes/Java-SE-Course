package com.course.javase.inheritance;

public class Dog extends Animal {

	@Override
	public void roar() {
		this.bark();
	}

	void bark() {
		Animal animal = new Animal();
		// String a = animal.c;
		System.out.println("au");
	}
}
