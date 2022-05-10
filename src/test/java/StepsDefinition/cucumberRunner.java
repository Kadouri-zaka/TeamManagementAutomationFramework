package StepsDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.*;
import org.junit.runner.RunWith;
import test.impl.pages.DriverHandler;

import static org.junit.Assert.fail;

@RunWith(Cucumber.class)
@CucumberOptions(
// plugin = {"pretty","rerun:target/rerun.txt"},

features = {"Features/BusinessRequestScenarioOutline/AddBrScenarioOutline/"
		+"AddNewBrPIPScenarioOutline.feature"

				
},
plugin = {"pretty", "html:target/cucumber-reports/cucumber.html",
"json:target/cucumber-reports/cucumber.json",
		"junit:target/cucumber-reports/cucumber.xml",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
glue="StepsDefinition"
)

public class cucumberRunner {
	static DriverHandler driver = new DriverHandler();

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//driver.initiatDriver();

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	//	driver.closeDriver();
	}

	@Before
	public void setUp() throws Exception {
		//driver.initiatDriver();
	}

	@After
	public void tearDown() throws Exception {
	//	driver.closeDriver();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	
}
