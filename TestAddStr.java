package jUnitTestingPack;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddStrCorrect {

	@Test
	public void test() {
		JUnitFunctions JUnit=new JUnitFunctions();
		String result = JUnit.addTwoStr("hello", "world");
		assertEquals("helloworld", result);
	}

}
