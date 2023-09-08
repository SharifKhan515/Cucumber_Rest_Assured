package bdd.api.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "",
        features = {"src/test/resources/featureFiles"},
        glue = {"definitions"},
        plugin = {}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
