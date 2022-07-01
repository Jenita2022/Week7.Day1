package steps;

import org.openqa.selenium.By;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLeadSteps extends BaseClass{
	String leadID;

	@When("Findby the Phone")
	public void clickPh() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}

	@When("Enter the PhoneNo {string}")
	public void phoneNo(String ph) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(ph);
	}

	@Then("Capture the Lead ID")
	public String leadID() {
		String textID = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(textID);
		leadID = textID.replaceAll("\\D", ""); // [^0-9] or \\D ---> remove all except digits
		System.out.println(leadID);
		return leadID;
	}
	@When("Enter the Lead ID")
	public void enterID() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}

	@Then("No Records msg should be displayed")
	public void deletemsg() {
		String delText = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if(delText.contains("No records"))
		{
			System.out.println("The record is Deleted");
		}
		else {
			System.out.println("The record is not Deleted");
		}
	}

}
