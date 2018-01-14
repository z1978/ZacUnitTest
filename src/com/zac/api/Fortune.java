package com.zac.api;

public class Fortune {
	RandomNumberGenerator random = new RandomNumberGenerator();

	public String pull() {
		int result = random.nextInt() % 4;
		switch (result) {
		case 0:
			return "大吉";
		case 1:
			return "中吉";
		case 2:
			return "小吉";
		default:
			return "末吉";
		}
	}
}
