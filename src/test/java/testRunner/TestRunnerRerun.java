package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//		dryRun = true,
		monochrome= true,
		features = "@target/failedrerun.txt",
		glue={"stepDefinitions"},
			
		stepNotifications = true,
		plugin= {"pretty",
				"html:target_rerun/html-report/test-report",
				"junit:target_rerun/junit-xml-report.xml",
				"json:target_rerun/cucumber-report/json-report.json",				
				}
		//,tags = ""

		)

public class TestRunnerRerun {

}
