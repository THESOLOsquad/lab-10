package jUnitTestingPack;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNumCorrect {

	@Test
	public void test() {
		JUnitFunctions JUnit=new JUnitFunctions();
		int result = JUnit.addTwoNum(100, 200);
		assertEquals(300, result);
	}

}
