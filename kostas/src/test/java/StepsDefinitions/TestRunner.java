package StepsDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue={"StepsDefinitions"},


plugin = { "pretty",  "junit:target/JUnitReports/report.xml",
		"json:target/JSONreports/report.json",
		"html:target/HtmlReports"}


		
		
		
		
		)

public class TestRunner {

}
