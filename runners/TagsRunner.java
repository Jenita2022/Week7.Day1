package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", 
				glue="steps", 
				//tags ="@regression" 
				//tags="@smoke and @regression",
				//tags="not @smoke"
				tags="@smoke or @regression",
				monochrome = true, 
				publish = true)
public class TagsRunner extends AbstractTestNGCucumberTests{
}