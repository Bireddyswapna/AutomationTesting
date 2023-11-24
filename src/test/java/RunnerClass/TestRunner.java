package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features= {"src\\test\\java\\FeatureFile"},
        glue= {"StepDefinition"},
        plugin={"pretty:STDOUT","html:target/cucumber-html-report",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml",
                "rerun:target/rerun.txt"},
        tags ="@smokeTest2"
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
