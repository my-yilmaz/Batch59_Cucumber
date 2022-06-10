package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = ("@hotelNegativeTest"),
        dryRun = false
)
public class TestRunner {
    // Bir framwork'de bir tek Runner Class'i yeterli olabilir
    // Runner class'inda class body sinde hicbir sey olmaz
    // Runner class imizi onemli yapan 2 adet annotaion vardir
    // @RunWith(Cucumber.class) notasyonu Runner class ina calisma ozalligi katar

}
