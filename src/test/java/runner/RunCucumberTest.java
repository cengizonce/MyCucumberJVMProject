package runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"feature/deneme.feature","feature/senaryolar.feature"},
        glue ="stepDefinition",
        monochrome = true,
        plugin = {
                "pretty",
                "json:target/Cucumber.json"
        }
)
public class RunCucumberTest {
    //plugin ={"pretty","html:target/cucumber-html-report","json:target/cucumber.json"}
}
