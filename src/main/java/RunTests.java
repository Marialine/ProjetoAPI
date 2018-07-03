import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/test/features", glue = "br.netshoes.steps", monochrome = true, dryRun = false)
public class RunTests {
}
