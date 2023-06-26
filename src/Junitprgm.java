import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junitprgm {

	@Before
	public void setUp()
	{
		System.out.println("browser opens");
	}
	
	@Test
	public void testing()
	{
		System.out.println("testing details");
	}
	
	
	
	@After
	public void teardown()  
	{
		System.out.println("browser closes");
	}
}
