package com.zac.api;

public class Calculator {

	public int divide(int x, int y) {
		if (y == 0) {
			throw new IllegalArgumentException("y must not be 0");
		}
		return x / y;
	}

	public int multiply(int x, int y) {
		return x * y;
	}

}