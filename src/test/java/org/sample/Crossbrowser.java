package org.sample;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
	WebDriver driver;
	@Parameters({"browserName"})
	@BeforeClass
	private void beforeclass(String browserName) {
		if (browserName.equals("Opera")) {
			System.setProperty("webdriver.opera.driver", "C:\\Users\\lenovo\\eclipse-workspace\\MavenTestNG\\driver\\operadriver_win64\\operadriver.exe");
			driver=new OperaDriver();
			}
		else if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\lenovo\\eclipse-workspace\\MavenTestNG\\driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	@AfterClass
	private void afterclass() {
		driver.quit();
}
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
      @Test
     private void test1() {
    	  driver.get("https://www.facebook.com/");
  		WebElement txtuser = driver.findElement(By.id("email"));
  		txtuser.sendKeys("moorthy");
  		WebElement txtpass = driver.findElement(By.id("pass"));
  		txtpass.sendKeys("12345678");
  		WebElement btnlgn = driver.findElement(By.name("login"));
  		btnlgn.click();
  	

}
		

	
	

}
