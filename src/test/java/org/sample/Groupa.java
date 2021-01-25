package org.sample;

import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Groupa {
	@AfterMethod
	private void aftermetod() {
		Date d= new Date();
   System.out.println("Test end...."+d);
	}
	@BeforeMethod
	private void beforemethod() {
		Date d=new Date();
		System.out.println("Test start...."+d);

	}

	@Test(groups="Smoke")
	private void test1() {
		System.out.println("moorthy");

	}
		@Test(groups="Santiy")
		private void test2() {
			System.out.println("siddhu");

		}
		
		
	@Test(groups="Regression")
	private void test3() {
		System.out.println("dhanshika");

	}
	


}
