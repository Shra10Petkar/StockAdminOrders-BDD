package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"./src/test/java"},
		glue = "StepDefination",
		dryRun = false,
		monochrome = true,
		plugin = {
				"pretty","html:target/HTMLReports/demoreport.html"
		}
		//tags = "@Execute"
		
		
		)

public class Runner extends AbstractTestNGCucumberTests{

}
