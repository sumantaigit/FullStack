package com.capgemini.java8.lambdaExpression;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstPredicates {

	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("One","Two","Three","Four");
		
		Predicate<String> p1 = s ->s.length() >3;
		Predicate<String> p2 = Predicate.isEqual("Two");
		Predicate<String> p3 = Predicate.isEqual("Three");
		Predicate<String> p4 = s -> { 
			System.out.println("ghhgfh"+s);
			return s.length() >3;} ;
		
		stream
				.filter((p4))
				.forEach(s -> System.out.println(s));

	}

}
