package com.course.javase;

import com.course.javase.definitions.Organism;
import com.course.javase.definitions.Robotable2;
import com.course.javase.inheritance.Person;

public class Designing {

	private final int id;

	// instance initializer
	{id = 1;}
	public Designing() {
		
	}
	
	public static void main(String[] args) {
		Person person = new Person("John");
		Organism organism = person.applyMetal("123");
		System.out.println(organism.toString());
		
		if(person instanceof Organism)
			System.out.println(true);
		
		if(person instanceof Robotable2)
			System.out.println(true);
	}
}
