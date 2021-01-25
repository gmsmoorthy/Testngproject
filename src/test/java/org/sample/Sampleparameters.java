package org.sample;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class Sampleparameters {
	 WebDriver driver;
	@BeforeClass
	public void before() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\MavenTestNG\\driver\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
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
	@Parameters({"name","password"})
	@Test
	public void test(String user,String pass) {
		System.out.println("Test1");
		driver.get("https://www.facebook.com/");
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys(user);
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys(pass);
		WebElement btnlgn = driver.findElement(By.name("login"));
		btnlgn.click();
	}

}
