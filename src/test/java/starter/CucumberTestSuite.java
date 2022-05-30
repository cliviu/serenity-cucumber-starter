package starter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;

@Suite
@IncludeEngines("cucumber")
//@RunWith(CucumberWithSerenity.class)
//@RunWith(Cucumber.class)
/*@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features"
)*/
@SelectClasspathResource("classpath:/features/parallel")
public class CucumberTestSuite {}
