package t1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoPrgm {

	ChromeDriver driver;
	@Test
	public void testing() throws IOException
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\\\"pickfiles\\\"]")).click();
		Runtime.getRuntime().exec("");
	}
	
	
	
	
}
