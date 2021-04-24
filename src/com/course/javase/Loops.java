package com.course.javase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Loops {

	public static void main(String[] args) {

		int[] primes = new int[3];
		primes[0] = 2;
		primes[1] = 3;
		primes[2] = 5;

		System.out.println(primes[2]);
		// System.out.println(primes[3]); indexoutofbound

		char[] a1 = { 'a', 'a', 'm', 'e' };
		char[] a2 = { 't', 'o', ' ', ' ', ' ' };
		System.arraycopy(a1, 2, a2, 3, 2);
		System.out.println(a1);
		System.out.println(a2);

		int i = 0;
		for (; i < a2.length;) {
			System.out.print(i);
			i++;
		}
		
		System.out.println();

		String[] names = { "Mary", "Jane", "Elizabeth", "Jo" };
		Arrays.sort(names, new Compare());
		for (String name : names) {
			System.out.println(name);
		}
		
		List<char[]> asList = Arrays.asList(a2);
		System.out.println(asList.iterator().next());
		
		
		
		System.out.println();

		
		
		List<String> list = new ArrayList<>(4);
		list.add(0,"a");
		list.add(1,"b");
		list.add(2,"c");
		list.set(1, null);
		list.add(3,"d");
		list.add(4,"e");
		list.add(5,"f");
		for (String string : list) {
			System.out.println(string);
		}
		
		//Map.of(null, null, null, null, null, null, null, null, null, null)
		
	}
	
	public static class Compare implements Comparator<String> {
		public int compare(String s1, String s2) {
			return s2.length() - s1.length();
		}
	}
}
