package com.course.javase.inheritance;

import com.course.javase.definitions.Organism;

public class Person extends Animal {

	String name;
	Robot robot;

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, Robot robot) {
		this.name = name;
		this.robot = robot;
	}

	@Override
	public Organism applyMetal(Robot robo) {
		System.out.println("I am paying to see");
		return new Person(name, robo);
	}

	@Override
	public void feel() {
		System.out.println("wow");
	}

	@Override
	public String toString() {
		return "Person name=" + name + " " +  ((this.robot != null) ? this.robot.bluetooth() : "is not a robot");
	}

}
