package com.course.javase.concurrent;

import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

public class PreventsCollectionsCorruption {

	//Immutable and thread safe
	
	public static void main(String[] args) {
		Collections.synchronizedMap(null);
		Collections.unmodifiableSet(null);
		//CopyOnWriteArrayList<><somelist>;
	}
}
