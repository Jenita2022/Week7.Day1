package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class DuplicateLeadSteps extends BaseClass {

	@When("Findby the Email")
	public void findByEmail() {
		driver.findElement(By.xpath("//span[text()='Email']")).click();
	}
	
	@When("Enter the Email {string}")
	public void Email(String email) {
		driver.findElement(By.name("emailAddress")).sendKeys(email);
	}
}
