package testngprgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Radio {
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void radio()
	{
		WebElement rbutton = driver.findElement(By.xpath("//input[@value='m']"));
		//rbutton.click();
		Boolean b =rbutton.isSelected();
		System.out.println("selected option is: "+rbutton.getText());
		if(b)
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
		}
	}
	@Test
	public void logo()
	{
		WebElement logo = driver.findElement(By.xpath("//img[@src='/register/pix/redifflogo1.gif']"));
		Boolean b =logo.isDisplayed();
		if(b)
		{
			System.out.println("displayed");
		}
		else
		{
			System.out.println("not dispalyed");
		}
	}
		@Test
		public void button()
		{
			WebElement btn = driver.findElement(By.xpath("//input[@class='submitbtn']"));
			Boolean b =btn.isEnabled();
			if(b)
			{
				System.out.println("enabled");
			}
			else
			{
				System.out.println("not enabled");
			}
	}
}
