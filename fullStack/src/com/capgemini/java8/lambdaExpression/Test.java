package com.capgemini.java8.lambdaExpression;

@FunctionalInterface
public interface Test {

	void test();

	default void test1() {

	}

	static void test2() {

	}
}
