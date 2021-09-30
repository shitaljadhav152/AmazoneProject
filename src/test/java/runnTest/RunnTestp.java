package runnTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
         (
        		// plugin="pretty",
        		 features="src/test/resources",
        		 glue="cucumber_mapping",
        		 tags="@SmokeTest",
        		 monochrome=true
		
		
		  )


public class RunnTestp {

}
