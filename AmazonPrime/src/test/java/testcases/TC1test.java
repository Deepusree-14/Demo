package testcases;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(democlass.Listenerclass.class)
public class TC1test {
	
	@Test
	public void m3()
	{
		Reporter.log("TC1 running");
	}

}
