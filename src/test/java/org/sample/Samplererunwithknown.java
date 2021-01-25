package org.sample;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Samplererunwithknown {
	@Test
	private void testA1() {
		Assert.assertTrue(true);
		System.out.println("TestA1");
	}
	@Test(retryAnalyzer=Rerunwithknown.class)
	private void testA2() {
		Scanner s=new Scanner(System.in);
		Assert.assertTrue(s.nextBoolean());
		System.out.println("TestA2");
		}
	@Test
	private void testA3() {
		Assert.assertTrue(true);
		System.out.println("TestA3");

	}

}
