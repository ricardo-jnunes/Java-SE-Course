package com.course.javase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.course.javase.inheritance.Robot;

public class LambdaStreams {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("abf", "zxcsfsb");

		// Anonymous inner class
		System.out.println(list);

		Collections.sort(list, new Comparator<String>() {
			public int compare(String a, String b) {
				return b.length() - a.length();
			}
		});
		System.out.println(list);

		// Lambda
		Collections.sort(list, (p1, p2) -> p2.compareTo(p1));
		System.out.println(list);

		Collections.sort(list, String::compareTo);
		System.out.println(list);

		List<String> list2 = new ArrayList<String>();
		list2.add("aa");
		list2.add("");
		list2.add("z");
		// String teste = "a";
		// teste.isBlank()
		Predicate<String> isBlank = (p) -> p.isBlank();
		list2.removeIf(isBlank);
		System.out.println(list2);

		// Streams
		System.out.println("Streaming");

		// loop
		for (String string : list2) {
			// if it is not blank
			// string.toUpperCase
		}
		// Stream
		list2.stream().parallel().filter(isBlank.negate()).map(String::toUpperCase).forEach(s -> System.out.println(s));

		// Some examples of Stream
		Stream.of(new Robot("234")).forEach(p -> System.out.println(p.bluetooth()));
		Stream.of("A", "B", "C").takeWhile(s -> !s.equals("B")).forEach(s -> System.out.println(s));
		Optional<String> reduce = Stream.of("A", "B", "C").reduce((s1, s2) -> s1 + "+" + s2);
		System.out.println(reduce.get());

		String collect = Stream.of("A", "B", "C").collect(Collectors.mapping(p -> p, Collectors.joining(",")));
		System.out.println(collect);

		// parallel Stream
		System.out.println(Arrays.asList("J", "A", "V", "A").stream().findAny().get()); // w

		System.out.println(Arrays.asList("J", "A", "V", "A").parallelStream().findAny().get()); // not predictable
	
		//Consumer<String> con = final String x->System.out.println(x);
	}
}
