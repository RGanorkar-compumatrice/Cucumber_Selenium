package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(cucumber.api.junit.Cucumber.class)
@CucumberOptions(features = "Features", glue = { "stepDefination" }, plugin = {"html:target/cucumber-html-report" })
/*@CucumberOptions(features = "Features", glue = { "stepDefination" }, plugin = { "html:target/cucumber-html-report",
		"json:target/cucumber-json-report.json", "pretty:target/cucumber-pretty-report.txt",
		"usage:target/cucumber-usage-report.json", "junit:target/cucumber-xml-report.xml" })*/
public class TestRunner {

}
