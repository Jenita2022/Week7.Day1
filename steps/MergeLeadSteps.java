package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MergeLeadSteps extends BaseClass{
	public String CFromID; 
	public String CToID; 
	public String parentwindow;

	@When("Click the From Lead icon")
	public void clickFromLeadIcon() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	}

	@Then("Find Leads new window should be displayed")
	public void findLeadsWindow() {
		//String parentwindow = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		List<String> lst = new ArrayList<String>(set);
		driver.switchTo().window(lst.get(1));
		System.out.println("Child Window Title: " +driver.getTitle());
		//return parentwindow;

	}

	@When("Capture the first resultant lead ID")
	public String captureFirstID() throws InterruptedException {
		Thread.sleep(2000);
		String CFromID = driver.findElement(By.xpath("//a[@class='linktext']")).getText();
		return CFromID;
	}

	@When("Click the first resultant lead ID")
	public void clickFResulID() {
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
	}
	//	@Then("Back to the parentwindow")
	//	public void parentwin() {
	//		String parentwindow = driver.getWindowHandle();
	//		driver.switchTo().window(parentwindow);
	//	}
	@Then("From Captured ID should be displayed in main window")
	public void verifyFromID() {
		String parentwindow = driver.getWindowHandle();
		driver.switchTo().window(parentwindow);
		System.out.println(driver.findElement(By.id("sectionHeaderTitle_leads")).getText());
		String verifyFID = driver.findElement(By.xpath("//table[@name='ComboBox_partyIdFrom']//td/input")).getText();
		if (verifyFID.equals(CFromID)){
			System.out.println("From Lead ID matches with first resultant captured Lead ID");
		}
		else {
			System.out.println("From Lead ID NOT matches with first resultant captured Lead ID");

		}
	}

	@When("Click the To Lead icon")
	public void clickToLeadIcon() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	}


	@When("Capture the second resultant lead ID")
	public String captureSecondID() throws InterruptedException {
		Thread.sleep(2000);
		String CToID = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[2]//a")).getText();
		return CToID;
	}

	@When("Click the second resultant lead ID")
	public void clickSecondID(){
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[2]//a")).click();
		driver.switchTo().window(parentwindow);
	}

	@Then("To Captured ID should be displayed in main window")
	public void verifyToID() {
		String verifyTID = driver.findElement(By.xpath("//input[@id='ComboBox_partyIdTo']")).getText();
		if (verifyTID.equals(CToID)){
			System.out.println("To Lead ID matches with second resultant captured Lead ID");
		}
		else {
			System.out.println("To Lead ID NOT matches with second resultant captured Lead ID");

		}
	}
	@Then("Alert window should be opened and click OK")
	public void alert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@Then("Verify the Lead ID")
	public void verifyID() throws InterruptedException {
		Thread.sleep(2000);
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String replaceAll = text.replaceAll("\\D","");
		System.out.println("Merge ID: "+ replaceAll);
	}

	@When("Enter the first captured Lead ID")
	public void enterLeadID() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(CFromID);
	}

}
