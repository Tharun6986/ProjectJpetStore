import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features={"src/test/resources/features"},
        glue={"testcases"}
        
)
@Test
public class testrunner extends  AbstractTestNGCucumberTests 
{

}
