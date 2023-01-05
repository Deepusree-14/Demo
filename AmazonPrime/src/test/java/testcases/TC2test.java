package testcases;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(democlass.Listenerclass.class)
public class TC2test {
	
	@Test
	public void m2()
	{
		Reporter.log("TC2 running");
	}

}
