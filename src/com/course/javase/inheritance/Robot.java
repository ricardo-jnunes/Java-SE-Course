package com.course.javase.inheritance;

public class Robot {

	String identity;

	public Robot() {
	}

	public Robot(String identity) {
		this.identity = identity;
	}

	public String bluetooth() {
		return "Connecting: " + identity;
	}

}
