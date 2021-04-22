package com.course.javase;

public enum Conditions {
	HOT, COLD;

	public enum SomeCondition {
		HOT("Much hot");

		String caution;
		SomeCondition(String caution) {
			this.caution = caution;
		}
	}
}
