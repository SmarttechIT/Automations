package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefenition {
	
	WebDriver driver;
	
	@Given("^User able to open any browser$")
	public void user_able_to_open_any_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:.\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		//driver.get("http://automationpractice.com/");
	    
	}

	@Given("^User able to enter the URL$")
	public void user_able_to_enter_the_URL() throws Throwable {
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
	}

	@When("^User able to click on Signin button$")
	public void user_able_to_click_on_Signin_button() throws Throwable {
		driver.findElement(By.xpath("//*[@class='login']")).click();
	  
	}

	@When("^User able to enter the Username$")
	public void user_able_to_enter_the_Username() throws Throwable {
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sobhanrstech@gmail.com"); 
	    
	}

	@When("^User able to enter the PW$")
	public void user_able_to_enter_the_PW() throws Throwable {
		driver.findElement(By.xpath("//*[@name='passwd']")).sendKeys("sabiha2019"); 
	    
	}

	@When("^User able to click on submit button$")
	public void user_able_to_click_on_submit_button() throws Throwable {
		driver.findElement(By.xpath("//*[@class='icon-lock left']")).click(); 
		 driver.findElement(By.xpath("//*[contains(@class,'logout')]")).click(); 
	    
	}

	@Then("^User able to login in susscessfully$")
	public void user_able_to_login_in_susscessfully() throws Throwable {
	 // driver.findElement(By.xpath("//*[contains(@class,'logout')]")).click();
	 //driver.findElement(By.xpath("//*[contains(@class,'logout')]")).click();   
	}

	@Then("^User able to verify the page title$")
	public void user_able_to_verify_the_page_title() throws Throwable {
	  //driver.close();
	    
	}

}
