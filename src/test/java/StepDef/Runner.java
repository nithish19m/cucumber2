package StepDef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\addtocart.feature", glue="StepDef", plugin="html:target/htmlreport")

public class Runner {
}
