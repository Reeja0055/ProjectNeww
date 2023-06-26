package testngprgms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demotestng {

	ChromeDriver driver;
	
	@BeforeSuite
	public void bsuite()
	{
	System.out.println("before suite");
	}
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
	}
	
	@BeforeClass
	public void bclass()
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void urlloads()
	{
		driver.get("https://www.facebook.com");
		//System.out.println("url loading..");
	}
	
	@Test(alwaysRun=true)
	public void registration()
	{
		System.out.println("test 1 executes");
	}
	
	
	@Test(dependsOnMethods="registration")
	public void login()
	{
		System.out.println("test 2 executes");
	}
	
	@AfterMethod
	public void aftermthd()
	{
		System.out.println("after method");
	}
	
	@AfterClass
	public void aclass()
	{
		System.out.println("after class");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
		//System.out.println("browser closes");
	}
	
	@AfterSuite
	public void asuite()
	{
	System.out.println("after suite");
	}
}
