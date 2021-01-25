package org.sample;

import org.testng.annotations.*;

public class Testproject {
	
@Test(priority =-1)
private void test1() {
	System.out.println("moorthy");

}
	@Test
	private void test2() {
		System.out.println("test1");

	}
	
	
@Test(priority=2)
private void test3() {
	System.out.println("test3");

}
@Test(priority=1)
private void test4() {
	System.out.println("test2");

}

}

