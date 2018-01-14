package com.zac.api;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class FortuneTest {
	@Test
	public void testPull() {
		Fortune fortune = new Fortune();
		fortune.random = new RandomNumberGenerator() {
			public int nextInt() {
				return 0;
			}
		};
		assertThat(fortune.pull(), is("大吉"));
	}

}
