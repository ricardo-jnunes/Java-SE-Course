package com.course.javase.inheritance;

import com.course.javase.definitions.Organism;

public class Dog extends Animal {

	@Override
	public void roar() {
		this.bark();
	}

	void bark() {
		System.out.println("au");
	}

	@Override
	public Organism applyMetal(Robot robo) {
		System.err.println("I am not cool with this yet");
		return null;
	}

	@Override
	public void feel() {
		System.out.println("thihihi");
	}
}
