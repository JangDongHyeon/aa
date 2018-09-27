package kr.itedu.exam10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {

	@Test
	void test() {
		assertEquals(3,Calc.calc(1, 2));
	}

}
