
package com.planitselenium.au;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author chaitanya
 *
 */
//TestCase1
public class TestCase1 extends InterruptedException{
	
		@Test
		public void testSubmitContactdetailsAndFeedBack() {
			
			//Setup ChromeDriver
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			//Call Webpage Url 
			driver.get("http://jupiter.cloud.planittesting.com");
			
			// 1. From the home page go to contact page	
			driver.findElement(By.xpath("//*[@id=\"nav-contact\"]/a")).click();
			
			//Wait For 5 seconds
			WebDriverWait wait1=new WebDriverWait(driver, 5);
			
			// 2.	Populate mandatory fields like forename, email and message in contact page.
			
			WebElement forenametext;
			forenametext= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("forename")));
			forenametext.sendKeys("Tom");
			
			
			WebElement emailtext;
			emailtext= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
			emailtext.sendKeys("tomg@gmail.com");
			
			WebElement messagetext;
			messagetext= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
			messagetext.sendKeys("Fluffy bunny I bought is good quality one. Thanks for the product.");
			
			driver.findElement(By.xpath("//*[@id=\"nav-contact\"]/a")).click();
			
			// 3.	Click submit button
			
			driver.findElement(By.cssSelector("body > div.container-fluid > div > form > div > a")).click();
			
		 }

		
	}




