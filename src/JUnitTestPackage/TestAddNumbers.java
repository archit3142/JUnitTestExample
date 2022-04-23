package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNumbers {

	@Test
	public void test() {
		JUnitTesting junit=new JUnitTesting();
		int result=junit.AddNumbers(20, 100);
		assertEquals(120, result);
	}
	
	@Test
	public void test2() {
		JUnitTesting junit=new JUnitTesting();
		int result=junit.AddNumbers(20, 100);
		assertEquals(10, result);
	}

}
