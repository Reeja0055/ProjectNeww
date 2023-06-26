package testngprgms;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Param {
	
	@Parameters("a")
	@Test
	public void testing(String a)
	{
		
		System.out.println("value is: "+a);
	}

}
