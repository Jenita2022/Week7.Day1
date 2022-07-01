package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadSteps extends BaseClass{

	@When("Click the Find Leads button")
	public void findLeadsButton() {
		driver.findElement(By.xpath("//button [text()='Find Leads']")).click();
	}

	@Then("Find Leads page should be displayed")
	public void FindLeadspg() {
		System.out.println(driver.getTitle());
	}
	@When("Findby the First name {string}")
	public void findByFname(String Fname){
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(Fname);
	}

	@When ("Click the first resultant First Name")
	public void clickfName() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
	}

	@Then ("The {string} page should be displayed")
	public void pgName(String page) throws InterruptedException {
		Thread.sleep(2000);
		String pgName = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		int compStr = pgName.compareTo(page); //return 0, if pgName and page matches
		if(compStr == 0){
			System.out.println("You are in right page");
		}else {
			System.out.println("You are NOT in right page");
		}
	}

	
//	@Then("Edit Lead page should be displayed")
//	public void editLeadpg() {
//		System.out.println(driver.getTitle());
//	}

	@Then("Clear the Company Name")
	public void clear() {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
	}

	@When("Enter the new Company Name {string}")
	public void newCoName(String newCoName) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(newCoName);
	}

	@When("Click the Update button")
	public void clickUpdate() {
		driver.findElement(By.xpath("//input[@value='Update']")).click();
	}

	@Then("Verify the Company Name and ID")
	public void updatedCoName() {
		String CoName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(CoName);
	}

	@When("Enter the Description {string}")
	public void description(String desc) {
		driver.findElement(By.id("updateLeadForm_description")).sendKeys(desc);
	}
	@Then("Verify the Description")
	public void verifyDescription() {
		 String des = driver.findElement(By.id("viewLead_description_sp")).getText();
		 System.out.println("Description " +des);

	}
}

