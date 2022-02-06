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
//Test case 3

public class TestCase3 {
	
	
	@Test
	public void addDifferentItemsToCart() {
	
    //Setup ChromeDriver
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	//Call Webpage Url 
	driver.get("http://jupiter.cloud.planittesting.com");
	
	//From the home page go to shop page
	driver.findElement(By.xpath("//*[@id=\"nav-shop\"]/a")).click();
	
	
    
	//Wait For 3 seconds
    WebDriverWait wait = new WebDriverWait(driver, 3000);
	
    
    /*1. Buy 2 Stuffed Frog, 5 Fluffy Bunny, 3 Valentine Bear
    Using For Loop iterating and adding the items to the cart
   */
    
	for (int i=0; i < 2; i ++) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"product-2\"]/div/p/a"))).click();
	}
	
	for (int i=0; i < 5; i ++) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"product-4\"]/div/p/a"))).click();
	}
	
	for (int i=0; i < 3; i ++) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"product-7\"]/div/p/a"))).click();
	}
	
	//2. Go to the cart Page
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"nav-cart\"]/a"))).click();
	
  }

}
