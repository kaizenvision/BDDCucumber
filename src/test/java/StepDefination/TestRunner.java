package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = {"StepDefination"}
, monochrome = true, plugin = {"pretty","html:target/HtmlReports/Htmlreport.html"}, tags = "smoke")
public class TestRunner {

}
