package Runner;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "src/main/java/org/br/curso/features", 
			glue = {"steps" },
			plugin = "json:target/cucumber-report-feature-composite.json", 
			tags = {"@CT_1"}, 



			snippets = SnippetType.UNDERSCORE
			)

public class TestRunner extends CucumberAbstractTest {
	
	@AfterMethod(alwaysRun = true)
	public void teardown(final Method method, final ITestContext context, final ITestResult result) {
		super.teardown(method, context, result);
	}

}
