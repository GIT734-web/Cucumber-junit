package StepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	WebDriver driver;
	@Given("I am able to navigate onto the login page")
	public void i_am_able_to_navigate_onto_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\MohitGautam\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe") ; 
	  driver = new ChromeDriver();//this is to open the new instant of browser
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	
	@When("I entered the username as {string}")
	public void i_entered_the_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys(string);
	   
	}


//	Some other steps were also undefined:

	@When("I entered the password as {string}")
	public void i_enterd_the_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtPassword")).sendKeys(string);
	   
	}
	@When("i click on the Login Button")
	public void i_click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	    
	}
	@Then("i should see the username as {string}")
	public void i_should_see_the_username_as(String string) throws InterruptedException {
	    String name = driver.findElement(By.id("welcome")).getText();
	    String Actualdata = string;
	    Assert.assertEquals(name,Actualdata);
	    System.out.println("Login Successfull");
	    Thread.sleep(3000);
	    driver.close();}
	    
	    @Then("i should see a error message as  {string}")
	    public void i_should_see_a_error_message_as(String string) {
	        // Write code here that turns the phrase above into concrete actions
	   String actualerr = driver.findElement(By.id("spanMessage")).getText();
	   String Expectederr = "Invalid credentials";
	   Assert.assertEquals(Expectederr,actualerr);
	    
	    
	}




}