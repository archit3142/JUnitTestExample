package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddStrings {

	@Test
	public void test() {
		JUnitTesting junitstring=new JUnitTesting();
		String result=junitstring.AddStrings("capstone","project");
		assertEquals("capstoneproject",result);
	}
	
	@Test
	public void test2() {
		JUnitTesting junitstring=new JUnitTesting();
		String result=junitstring.AddStrings("capstone","project");
		assertEquals("capstonepproject",result);
	}

}
