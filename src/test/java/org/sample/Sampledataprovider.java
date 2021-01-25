package org.sample;

import java.sql.Driver;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Sampledataprovider {
static WebDriver driver;
	@BeforeClass
	private void beforeclass() {	
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

	@DataProvider(name="login")
	public static Object[][] getData() {
		Object[][] ob=new Object[][] {
			{"moorthy","12345","gms","98765"},
		     {"siva","3456","siddhu","0000"},
		     {"dhanshi","1111","sai","2222"},
		     
		};
		return ob;
		}
	
	
	
	@Test(dataProvider="login")
	private void test1(String user,String pass,String fname,String lname) {
		System.out.println("hai");
		driver.get("https://www.facebook.com/");
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys(user);
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys(pass);
		WebElement btncreate = driver.findElement(By.xpath("//a[@rel='async']"));
		btncreate.click();
		WebElement txtfname = driver.findElement(By.name("firstname"));
		txtfname.sendKeys(fname);
		WebElement txtsurname = driver.findElement(By.name("lastname"));
		txtsurname.sendKeys(lname);
		
		
		//WebElement btnlgn = driver.findElement(By.name("login"));
	//	btnlgn.click();

	}

}
