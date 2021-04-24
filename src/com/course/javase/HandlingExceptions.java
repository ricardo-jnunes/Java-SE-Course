package com.course.javase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HandlingExceptions {

	public void test() {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("test.txt"));
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	public void testResources() {
		try (Scanner scanner = new Scanner(new File("test.txt"))) {
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
	}
}
