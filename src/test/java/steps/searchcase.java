package steps;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class searchcase {	
	
	WebDriver driver;

	@Given("User is on Chrome Browser")
	public void user_is_on_chrome_browser() {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();	   
	}
	@When("Users enters the url")
	public void users_enters_the_url() {
		driver.get("https://demowebshop.tricentis.com/");
	}
	@Then("User is on Login Page")
	public void user_is_on_login_page() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("sohailciet111@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("1234sonu");
	    driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	}
   @Then("User Searches on search page and close Browser") 
		public void User_Searches_on_search_page_and_close_Browser() {
		    driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).sendKeys("camera");		    driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();	    driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[1]/a/img")).click();		
		    
		    driver.close();
   }
}
