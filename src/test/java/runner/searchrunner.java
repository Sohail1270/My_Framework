package runner;



import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\91939\\eclipse-workspace\\My_FrameworkCucumber\\src\\test\\java\\Feature\\Search.feature",
		glue = {"steps"},
		plugin= {"pretty","html:target/cucumberreport.html"}
		
		)
public class searchrunner {

}
