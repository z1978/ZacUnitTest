package com.zac.api;

import java.util.Random;

public class RandomNumberGenerator {
	private Random random = new Random();

	public int nextInt() {
		return random.nextInt();
	}
}