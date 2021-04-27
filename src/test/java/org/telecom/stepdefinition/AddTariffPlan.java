package org.telecom.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddTariffPlan {
	public static WebDriver driver;


	@Given("user lanches Telecom application")
	public void user_lanches_Telecom_application() {
	    
				WebDriverManager.chromedriver().setup();
			    driver = new ChromeDriver();
				driver.get("http://www.demo.guru99.com/telecom/");
				driver.manage().window().maximize();
	}

	@Given("user click on Add tariff plan button")
	public void user_click_on_Add_tariff_plan_button() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("user need to fill up the Add tariff plan fields")
	public void user_need_to_fill_up_the_Add_tariff_plan_fields() {
		driver.findElement(By.id("rental1")).sendKeys("3000"); 
		driver.findElement(By.id("local_minutes")).sendKeys("300"); 
		driver.findElement(By.id("inter_minutes")).sendKeys("600"); 
		driver.findElement(By.name("sms_pack")).sendKeys("100"); 
		driver.findElement(By.id("minutes_charges")).sendKeys("150"); 
		driver.findElement(By.id("inter_charges")).sendKeys("200"); 
		driver.findElement(By.id("sms_charges")).sendKeys("149"); 
	
	}

	@When("user click on Submit button")
	public void user_click_on_Submit_button() {
		driver.findElement(By.name("submit")).click();

	}

	@Then("user verify to the Congratulation add Tariff Plan text")
	public void user_verify_to_the_Congratulation_add_Tariff_Plan_text() {
		WebElement text= driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']"));
		Assert.assertEquals("Congratulation you add Tariff Plan", text.getText());
	    
	}
	
	@When("user need to fill up the Add tariff plan fields by one dimensional list")
   public void user_need_to_fill_up_the_Add_tariff_plan_fields_by_one_dimensional_list(DataTable dataTable) {
		
		   List<String> datas = dataTable.asList(String.class);
		driver.findElement(By.id("rental1")).sendKeys(datas.get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(datas.get(1)); 
		driver.findElement(By.id("inter_minutes")).sendKeys(datas.get(2)); 
		driver.findElement(By.name("sms_pack")).sendKeys(datas.get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(datas.get(4)); 
		driver.findElement(By.id("inter_charges")).sendKeys(datas.get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(datas.get(6));
	}

	@When("user need to fill up the Add tariff plan fields by one dimensional map")
	public void user_need_to_fill_up_the_Add_tariff_plan_fields_by_one_dimensional_map(DataTable dataTable) {
	   
		Map<String, String> datas = dataTable.asMap(String.class, String.class);			
		driver.findElement(By.id("rental1")).sendKeys(datas.get("rental1"));
		    driver.findElement(By.id("local_minutes")).sendKeys(datas.get("local_minutes")); 
			driver.findElement(By.id("inter_minutes")).sendKeys(datas.get("inter_minutes")); 
			driver.findElement(By.name("sms_pack")).sendKeys(datas.get("sms_pack"));
			driver.findElement(By.id("minutes_charges")).sendKeys(datas.get("minutes_charges")); 
			driver.findElement(By.id("inter_charges")).sendKeys(datas.get("inter_charges"));
			driver.findElement(By.id("sms_charges")).sendKeys(datas.get("sms_charges"));
	}

	@When("user need to fill up the Add tariff plan fields by two dimensional list")
	public void user_need_to_fill_up_the_Add_tariff_plan_fields_by_two_dimensional_list(DataTable dataTable) {
	    
		List<List<String>> datas = dataTable.asLists(String.class);
		driver.findElement(By.id("rental1")).sendKeys(datas.get(1).get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(datas.get(0).get(1)); 
		driver.findElement(By.id("inter_minutes")).sendKeys(datas.get(2).get(2)); 
		driver.findElement(By.name("sms_pack")).sendKeys(datas.get(3).get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(datas.get(4).get(4)); 
		driver.findElement(By.id("inter_charges")).sendKeys(datas.get(3).get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(datas.get(0).get(6));
		
	}

	@When("user need to fill up the Add tariff plan fields by two dimensional map")
	public void user_need_to_fill_up_the_Add_tariff_plan_fields_by_two_dimensional_map(DataTable dataTable) {
	     List<Map<String, String>> datas = dataTable.asMaps(String.class,String.class);
	     driver.findElement(By.id("rental1")).sendKeys(datas.get(1).get("RT"));
			driver.findElement(By.id("local_minutes")).sendKeys(datas.get(0).get("LM")); 
			driver.findElement(By.id("inter_minutes")).sendKeys(datas.get(2).get("IM")); 
			driver.findElement(By.name("sms_pack")).sendKeys(datas.get(3).get("SP"));
			driver.findElement(By.id("minutes_charges")).sendKeys(datas.get(4).get("MC")); 
			driver.findElement(By.id("inter_charges")).sendKeys(datas.get(3).get("IC"));
			driver.findElement(By.id("sms_charges")).sendKeys(datas.get(0).get("SC"));
			
	}
}
