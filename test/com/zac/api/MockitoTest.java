package com.zac.api;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

class Foo {
	public int oneArgMethod(int a) {
		return 0;
	}

	public int twoArgMethod(int a, int b) {
		return 0;
	}
}

public class MockitoTest {

	@Test
	public void test() {
		Foo stub = mock(Foo.class);

		// 任意の値
		when(stub.oneArgMethod(anyInt())).thenReturn(987);

		// 特定の値が指定されたとき（anyの後に書く必要あり）
		when(stub.oneArgMethod(1)).thenReturn(123);
		when(stub.oneArgMethod(2)).thenReturn(345);

		// 2引数
		when(stub.twoArgMethod(eq(1), anyInt())).thenReturn(1234);

		// 設定したスタブのテスト
		assertThat(stub.oneArgMethod(1), is(123));
		assertThat(stub.oneArgMethod(2), is(345));
		assertThat(stub.oneArgMethod(3), is(987));
		assertThat(stub.twoArgMethod(1, 2), is(1234));
		assertThat(stub.twoArgMethod(1, 3), is(1234));
	}

	@Test
	public void test2() {
		Foo stub = mock(Foo.class);

		when(stub.twoArgMethod(anyInt(), anyInt())).thenReturn(9999);
		when(stub.twoArgMethod(2, 1)).thenReturn(1111);
		when(stub.twoArgMethod(2, 2)).thenReturn(2222);

		assertThat(stub.twoArgMethod(2, 1), is(1111));
		assertThat(stub.twoArgMethod(2, 2), is(2222));
		assertThat(stub.twoArgMethod(2, 3), is(9999));
		assertThat(stub.twoArgMethod(2, 4), is(9999));
	}

}