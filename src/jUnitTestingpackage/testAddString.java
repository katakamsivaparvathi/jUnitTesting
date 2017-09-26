package jUnitTestingpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitFunction junitString= new jUnitFunction();
		String result = junitString.addstrings("capstone","project");
		assertEquals("capstoneproject",result);
	}

}
