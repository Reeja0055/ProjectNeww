package testngprgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	WebDriver driver;
	String baseurl="";
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public  void url()
	{
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	@Test
	public void testing()
	{
		driver.findElement(By.xpath("")).click();
		
		while(true)
		{
			WebElement month =driver.findElement(By.xpath("//*[@class='uit-date-picker-menu-months-container']/div/h2"));
			
			String month1 =month.getText();
			if(month1.equals("March 2023"))
			{
				System.out.println(month1);
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@class='uitk-calendar']/div/button[2]")).click();
				
			}
		}
		
		List<WebElement> alldates = driver.findElement(By.xpath("//*[@class='uitk-calendar']/div[2]/div[1]/table/tbody/tr/td/button"));
		
		for(WebElement dateelement:alldates)
		{
			String date = dateelement.getAttribute("data-day");
			System.out.println(date);
			if(date.equals("18"))
			{
				dateelement.click();
				System.out.println("date selected");
			}
		}
	}
}
