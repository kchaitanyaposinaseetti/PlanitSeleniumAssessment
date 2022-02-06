package com.planitselenium.au;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author chaitanya
 *
 */
//TestCase2
public class TestCase2 {
	
	@Test
	public void testAddTocart() {
		
		
		//Setup ChromeDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Call Webpage Jupiter Toys Url 
		driver.get("http://jupiter.cloud.planittesting.com");
		
		//1.	From the home page go to shop page
		
		String homeUrl = driver.findElement(By.cssSelector("body > div.navbar.navbar-inverse.navbar-fixed-top > div > div > a.brand")).getAttribute("href");
		
		System.out.println(homeUrl);
		
		driver.findElement(By.xpath("//*[@id=\"nav-shop\"]/a")).click();
		
		//wait for 2 seconds
		
		WebDriverWait wait = new WebDriverWait(driver, 2);

		//2.	Click buy button 2 times on “Funny Cow”
		for (int i=0; i < 2; i ++) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"product-6\"]/div/p/a"))).click();
		}
		
		//3.	Click buy button 1 time on “Fluffy Bunny”
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"product-4\"]/div/p/a"))).click();
		
		//4.	Click the cart menu
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"nav-cart\"]/a"))).click();
	}

}
