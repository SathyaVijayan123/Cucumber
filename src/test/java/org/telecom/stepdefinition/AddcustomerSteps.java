package org.telecom.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddcustomerSteps {

public static WebDriver driver;
	
     @Given("user lanches telecom application")
      public void user_lanches_telecom_application() {
	    
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/telecom/");
		driver.manage().window().maximize();
		
	}

	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {
		
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	    
	}

	@When("user need to fill up the fields")
	public void user_need_to_fill_up_the_fields() {
		
		driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		driver.findElement(By.id("fname")).sendKeys("sathya");
		driver.findElement(By.id("lname")).sendKeys("vijayan");
		driver.findElement(By.id("email")).sendKeys("sathya@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("aranthangi");
		driver.findElement(By.id("telephoneno")).sendKeys("0445678934");
	    
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	}

   @Then("user verify customer id is generated")
    public void user_verify_customer_id_is_generated() {
	   Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}
}
