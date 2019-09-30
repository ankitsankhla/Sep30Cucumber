package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPomTest {
	WebDriver driver;
	@Given("User is on HeroKuApp")
	public void user_is_on_HeroKuApp() {
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/login");
		
		


	}

	@When("user enter user name and password")
	public void user_enter_user_name_and_password() {
		LoginOR obj = new LoginOR(driver);
		obj.usern.sendKeys("tomsmith");
		obj.password.sendKeys("SuperSecretPassword!");
		obj.login.click();
		
//		driver.findElement(By.id("username")).sendKeys("tomsmith");
//		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.className("radius")).click();

	}

	@Then("user ;ogged in sucessfully")
	public void user_ogged_in_sucessfully() {
		System.out.println("User logged in successfully");
	}

}
