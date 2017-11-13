
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/features",format = { "pretty", "html:target/cucumber",
    "json:target/cucumber.json"} , glue = "com/ncc/group/test/steps")
public class AcceptanceTest
{

}
