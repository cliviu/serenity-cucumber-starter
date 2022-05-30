package features.parallel;

import io.cucumber.junit.CucumberOptions;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;




@Suite
@IncludeEngines("cucumber")
@CucumberOptions(
        //plugin = {"pretty"},
		plugin = "io.cucumber.core.plugin.SerenityReporter",
        features = "src/test/resources/features"
)
//@SelectPackages({"features.parallel"})
@SelectClasspathResource("/features/parallel")
public class CucumberTestSuite {}
