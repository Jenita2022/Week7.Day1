package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	public ChromeDriver driver;

	@Given("Open the chrome browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Given("Enter the url {string}")
	public void loadURL(String url) {
		driver.get(url);
	}
	@Given("Enter username {string}")
	public void enterUsername(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);
	}
	@Given("Enter password {string}")
	public void enterPwd(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@When("Click Login button")
	public void clickLogin() { 
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Home page should be displayed")
	public void verifyHomepage() { 
		boolean crmLinkDisplay = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if (crmLinkDisplay==true){
			System.out.println("Homepage is displayed");
		}
		else
			System.out.println("Home page is not displayed");
	}

	@But("Home page should not be displayed")
	public void errorMsg() {
		System.out.println("Error msg is displayed");
	}
}
