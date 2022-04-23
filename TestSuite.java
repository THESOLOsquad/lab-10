package jUnitTestingPack;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAddNumCorrect.class, TestAddNumIncorrect.class, TestAddStrCorrect.class,
		TestAddStrIncorrect.class })
public class TestSuitebyNalin {

}
