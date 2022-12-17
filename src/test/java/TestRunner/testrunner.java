package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllFeature"},
		extraGlue= {"StepDefination"},
		monochrome=true,
		dryRun=false,
		tags=" @LoginPage or @HomePage ",
		plugin= {"html:reports/abc.html"}
		)

public class testrunner {

}
