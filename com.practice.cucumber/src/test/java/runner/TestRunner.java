package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(cucumber.api.junit.Cucumber.class)
@CucumberOptions(features = "Features", //Path for feature file.
glue = { "stepDefination" },            // Path for stepDefinaton file.
plugin = {"html:target/cucumber-html-report", "junit:target/cucumber-xml-report.xml"}, // To generate different type of Reporting.
//dryRun = true, 						//To check the mapping between feature and step def files. 
monochrome= true,                   //Display the console output in proper readable format.  
strict= true,						//It will check the mapping is proper between feature and step def files.
tags = {"@SmokeTest, @RegressionTest"})

//OR(ORed): tags={"@SmokeTest, @RegressionTest"}  -- execute all tests tagged as @SmokeTest or @RegressionTest
//AND(ANDed) tags={"@SmokeTest", "@RegressionTest"} -- execute all tests tagged as @SmokeTest and @RegressionTest
/*Ignore tags= {"~@SmokeTest", "@RegressionTest"}    "~" special character is used to ignore test here only tests are 
														execute which are tagged as @RegressionTest*/

public class TestRunner {
	
}
