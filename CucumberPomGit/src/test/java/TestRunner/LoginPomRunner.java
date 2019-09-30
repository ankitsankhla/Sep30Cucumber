package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(
		features="features",
		glue= {"stepDefination"} ,
		plugin = {"json:target/cucumber-report/GFT26AugReport.json"}

		)
public class LoginPomRunner {

}
