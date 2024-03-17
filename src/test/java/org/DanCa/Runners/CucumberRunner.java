package org.DanCa.Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"org.DanCa.StepsDefinitions", "org.DanCa.Hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@TEST-LI002"
)

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
