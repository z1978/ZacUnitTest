package com.zac.api;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class AssertionTest {

	@Test
	public void testFoo() {
		Assertion assertion = new Assertion();
		assertThat(assertion.foo(), is(not(0)));
	}

	@Test
	public void testBar() {
		Assertion assertion = new Assertion();
		assertThat(assertion.bar(), is(notNullValue()));
	}

	@Test
	public void testBaz() {
		Assertion assertion = new Assertion();
		assertThat(assertion.baz(), hasItem("def"));
	}

}