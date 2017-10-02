package framework;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		// This creates cucumber reports
        plugin = {"pretty", "html:target/site/cucumber-pretty"},
        //This create auto method name in camelCase
        snippets = cucumber.api.SnippetType.CAMELCASE,
        
        //Path to feature file
        features = {"src/test/resources/features"},
        // Tags to be executed
        tags = {"@search-engine-test"},
        //Step definition package name 
        glue = {"stepdefinition"}
)
public class TestRunner {
	
}
