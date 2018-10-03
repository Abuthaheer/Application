package Tests;

import org.junit.runner.RunWith;
	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "Feature", glue = "steps", dryRun=false)
	public class TestRunner {

	}


