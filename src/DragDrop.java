import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragDrop {

	ChromeDriver driver;


	@BeforeMethod
	public void url()
	{
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
	}

	@Test
	public void testing() throws InterruptedException
	{
		driver.manage().window().maximize();
		WebElement drag= driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop= driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act = new Actions(driver); 
		
		act.dragAndDrop(drag,drop).perform();
		
	}
}
