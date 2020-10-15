package com.multycart.qa.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelNs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_win32\\chromedriver.exe");//Setup Browser and Driver path
		WebDriver driver = new ChromeDriver();//Create object of driver path
		driver.get("https://www.google.com/");// Step 1 launch URL
		driver.findElement(By.name("q")).sendKeys("facebook");//Step 2 Enter Facebook in Search field
		driver.findElement(By.name("btnK")).click();// Click on Search
		driver.quit();//close all browsers 
	}

}
