package com.org.sum.Core;

@FunctionalInterface
public interface Test {

	void test();

	default void test1() {

	}

	static void test2() {

	}
}
