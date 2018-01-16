package com.zac.api;

import java.util.ArrayList;
import java.util.List;

public class Assertion {

	public int foo() {
		return 123;
	}

	public Object bar() {
		return new Object();
	}

	public List<String> baz() {
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("def");
		list.add("xyz");
		return list;
	}

}