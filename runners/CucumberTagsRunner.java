package runners;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features="src/test/java/features",
				 glue="steps",
				 //tags = "@sanity",
				 //tags = "@functional and @regression",
				 tags = "not @functional",
				 monochrome = true,
				 publish = true)

public class CucumberTagsRunner extends BaseClass{
}
