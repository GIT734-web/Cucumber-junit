package Runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features = {"src/test/resources/Login/Login.feature"},
glue= {"StepDefination"},
tags="@InvalidLogin and @Login",
dryRun=false,//this is basically to check did i implement all the method//incase if a missed any method this will help me to find
monochrome=true,
strict = true,//this will check very strictly if any step is missing in step defination
plugin = {"html:testoutput/mohit.html","junit:testoutput/mohit.xml","json:testoutput/mohit.json"}
)
public class Test_Runner {

	
}
