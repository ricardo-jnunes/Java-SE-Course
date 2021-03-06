package com.course.javase.definitions;

import com.course.javase.inheritance.Robot;

@FunctionalInterface
public interface Robotable<T> {
	double pid = 0f;

	//private void cafe();

	T applyMetal(Robot robo);

	public default T applyMetal(String id) {
		return applyMetal(new Robot(id));
	}
	
	// void invalidFunctionalInterfaceTest();
}
