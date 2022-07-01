package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import hooks.CucumberHooks;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadSteps extends BaseClass{

//public ChromeDriver driver;
//	@Given ("Open the Browser")
//	public void openBrowser(){
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
//		}
//	@Given("Load the url")
//	public void loadUrl(){
//		driver.get("http://leaftaps.com/opentaps");
	//}
	@Given("Enter the username {string}")
	public void userName(String UserName){
		driver.findElement(By.id("username")).sendKeys(UserName);
	}
	@Given("Enter the password {string}")
	public void pwd(String Pwd){
		driver.findElement(By.id("password")).sendKeys(Pwd);
	}
	@When ("Click the Login button")
	public void clickLogin(){
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Welcome screen should be displayed")
	public void verifyWelcomeScreen(){
		boolean displayed = driver.findElement(By.className("decorativeSubmit")).isDisplayed();
		if(displayed==true) {
			System.out.println("Welcome screen is displayed");
		}
	}
	@When("Click the CRMSFA link")
	public void clickCRMS(){
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	}
//	@Then("MY Home page should be displayed")
//	public void myLeadsPage(){
//		String Leadtitle = driver.getTitle();
//		System.out.println(Leadtitle);
//	}
	@Then("{string} page should be displayed")
	public void pageName(String page){
		boolean pgStatus = driver.findElement(By.linkText(page)).isDisplayed();
		if(pgStatus==true) {
			System.out.println(page+"Page is displayed");
		}
		else {
			System.out.println(page+"Page is not displayed");
		}
		//Assert.assertTrue(true);
	}
//	@When("Click on Leads tab")
//	public void clickLeads(){
//		driver.findElement(By.xpath("//a[text()='Leads']")).click();
//	}
	@When("Click the {string} link")
	public void clickLinks(String linkName){
		driver.findElement(By.linkText(linkName)).click();
	}
		
//	@Then("Leads page should be displayed")
//	public void myLeadsPage(){
//		String Leadtitle = driver.getTitle();
//		System.out.println(Leadtitle);
//	}

//	@When("Click on Create Lead link")
//	public void clickCreateLeadLink(){
//		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
//	}
	
//	@Then("Create Lead page should be displayed")
//	public void CreateLeadPage(){
//		String createLeadtitle = driver.getTitle();
//		System.out.println(createLeadtitle);
//	}
	@When("Enter the Company name {string}")
	public void coName(String CoName){
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CoName);
	}
	@When("Enter the First name {string}")
	public void firstName(String FName){
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(FName);
	}
	@When("Enter the Last name {string}")
	public void lastName(String LName){
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys(LName);
	}
	@When("Click the Create Lead button")
	public void clickCreateLeadButton(){
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	}
	@Then("Lead should be created successfully")
	public void createNewLead(){
		String coName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		String lastName = driver.findElement(By.id("viewLead_lastName_sp")).getText();
		System.out.println(coName +" "+firstName +" "+lastName);
	}

	@When("Leave the First name blank")
			public void blankFirstName() {
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("");
			}
	
	@When("Leave the Last name blank")
	public void blankLastName() {
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("");
	}
	
	@When("Leave the Company name blank")
	public void blankCoName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("");
	}
	
	@But("Error msg should be displayed")
	public void errorMsgCL() {
		System.out.println("Error msg: Mandatory fields should not be blank");
		
	}

}
