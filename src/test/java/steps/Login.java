package steps;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;


	@Given("User is on the Chrome browser")
	public void OpenBrowser() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	
	@When("User enters  the URL")
	public void EnterUrl() {
		
		
		driver.get("https://demowebshop.tricentis.com/");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		
	}
		@Then("User click on the Login")
		public void user_is_on_login_page() {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		    driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("sohailciet111@gmail.com");
		    driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("1234sonu");
		    driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		}

		@And("User closes the browser")
		public void Closebrowser () {
			driver.close();
		}
	
	
	
	
	
}

