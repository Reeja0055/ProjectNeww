package testngprgms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FilePrgm {
	
	WebDriver driver;
	@BeforeTest
	public void btest()
	{
		driver = new ChromeDriver();
		
	}

	@Test
	public void testing() throws IOException
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		
		Runtime.getRuntime().exec("C:\\t1.exe"); //executes AutoIT script
	}
}
