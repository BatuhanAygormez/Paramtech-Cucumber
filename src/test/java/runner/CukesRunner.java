package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty"

        },
        features = "src/test/resources/features",
        glue = "step_def",
        dryRun = false,
        tags = ""
        //tags = "@test1"
        //tags = "@test2"
)

public class CukesRunner {

}
