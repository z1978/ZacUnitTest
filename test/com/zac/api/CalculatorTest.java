package com.zac.api;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class CalculatorTest {
	
	@RunWith(Theories.class)
    public static class TestMultiply {
        @DataPoints
        public static Fixture[] FIXTURES = {
            new Fixture(4, 2, 8),
            new Fixture(6, 2, 12),
            new Fixture(6, 3, 18)
        };

        Calculator calc;

        @Before
        public void setUp() {
            calc = new Calculator();
        }

        @Theory
        public void testMultiply(Fixture f) {
            assertThat(calc.multiply(f.x, f.y), is(f.expected));
        }
    }
	
	static class Fixture {

        private int x;
        private int y;
        private int expected;

        public Fixture(int x, int y, int expected) {
            this.x = x;
            this.y = y;
            this.expected = expected;
        }

    }
	
	@RunWith(Theories.class)
    public static class NormalCase {
        @DataPoints
        public static Fixture[] FIXTURES = {
            new Fixture(4, 2, 2),
            new Fixture(6, 2, 3),
            new Fixture(6, 3, 2)
        };

        Calculator calc;

        @Before
        public void setUp() {
            calc = new Calculator();
        }

        @Theory
        public void testDivide(Fixture f) {
            assertThat(calc.divide(f.x, f.y), is(f.expected));
        }
    }
	
//	public static class NormalCase {
//		Calculator calc;
//
//		@Before
//		public void setUp() {
//			calc = new Calculator();
//		}
//
//		@Test
//		public void testDivide_4_2() {
//			assertThat(calc.divide(4, 2), is(2));
//		}
//
//		@Test
//		public void testDivide_6_2() {
//			assertThat(calc.divide(6, 2), is(3));
//		}
//
//		@Test
//		public void testDivide_6_3() {
//			assertThat(calc.divide(6, 3), is(2));
//		}
//	}

	public static class NormalCaseLeaveRemainder {
		Calculator calc;

		@Before
		public void setUp() {
			calc = new Calculator();
		}

		@Test
		public void testDivide_5_2() {
			assertThat(calc.divide(5, 2), is(2));
		}

		@Test
		public void testDivide_7_3() {
			assertThat(calc.divide(7, 3), is(2));
		}
	}

	public static class AbnormalCase {
		Calculator calc;

		@Before
		public void setUp() {
			calc = new Calculator();
		}

		@Test(expected = IllegalArgumentException.class)
		public void testDivide_1_0() {
			calc.divide(1, 0);
		}
	}
}
