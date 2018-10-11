package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import com.trivago.cluecumber.CluecumberReportPlugin;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="Features",
        glue={"StepDefinition"},
        plugin = {"html:target/cucumber-report-html/cucumber.html"})
public class Runner {

}
