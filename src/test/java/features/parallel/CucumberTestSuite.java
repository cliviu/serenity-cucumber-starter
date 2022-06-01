package features.parallel;

import io.cucumber.junit.CucumberOptions;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;


@Suite
@IncludeEngines("cucumber")
@CucumberOptions(
		plugin = "io.cucumber.core.plugin.SerenityReporter"
)
@SelectClasspathResource("/features/parallel")
public class CucumberTestSuite {}
