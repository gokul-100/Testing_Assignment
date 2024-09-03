package StepDefination;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags=" ",features= {"src/test/resoures/Features"},glue = {"StepDefination"},
plugin = {"pretty","html:target/htmlreport.html"})
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

}
