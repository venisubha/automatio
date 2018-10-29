package org.cucumber.runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\org\\cucumber\\feature\\", 
		glue = "org.cucumber.stepdefinition", 
		tags = {"@Fblogin", "~@Ignore" }, 
		dryRun = false, 
		monochrome = true, 
		strict = true, 
		plugin = { "pretty",
			"html:Reports", "junit:Reports/cucumber.xml", "json:Reports/cucumber.json" })

public class TestRunner {

}
