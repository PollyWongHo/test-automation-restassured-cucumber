package options;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//plugin = {"pretty"},
		//plugin = {"html:target"},
		format = { "pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json" },
		glue = {"stepdefs"},
		monochrome = true,
		features = {"src/test/features"})
public class CucumberTests {}
