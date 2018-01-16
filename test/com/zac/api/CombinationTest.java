package com.zac.api;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CombinationTest {

	@Test
	public void testJudge_true_1() {
		Combination comb = new Combination();
		assertThat(comb.judge(true, 1), is(true));
	}

	@Test
	public void testJudge_true_0() {
		Combination comb = new Combination();
		assertThat(comb.judge(true, 0), is(false));
	}

	@Test
	public void testJudge_false_5() {
		Combination comb = new Combination();
		assertThat(comb.judge(false, 5), is(false));
	}

	@Test
	public void testJudge_false_0() {
		Combination comb = new Combination();
		assertThat(comb.judge(false, 0), is(false));
	}

}