package runners;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features="src/test/java/features/EditLead.feature", glue={"steps"}, monochrome = true, publish = true)
public class EditLeadRunners extends BaseClass {
}
