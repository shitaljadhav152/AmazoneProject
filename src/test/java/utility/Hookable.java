package utility;

import java.net.UnknownHostException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hookable 
{
	@Before
	public void before(Scenario scenario) throws UnknownHostException 
	{
		HTMLReportGenerator.TestSuiteStart("D:\\Report1", "amazone");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus().toString());
		System.out.println("------------------------------------------Scenario Start----------------------------------------------------------");
	}
	@After
	public void after(Scenario scenario)
	{
		System.out.println("------------------------------------------Scenario end----------------------------------------------------------");
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
		
	}

}
