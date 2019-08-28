
package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
    glue = {"stepDefinition"},
    features = {"src/main/java/feature/postFeature.feature"}
 
    )


public class PostRunner {

}