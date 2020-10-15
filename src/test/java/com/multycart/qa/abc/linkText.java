package com.multycart.qa.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_win32\\chromedriver.exe");//setup Browser and Driver Path
		WebDriver driver = new ChromeDriver(); //Create Object of WebDriver 
		driver.get("https://www.google.com/");//Step 1 Launch Google URL
		driver.findElement(By.linkText("Gmail")).click();//step 2 Search Gmail
		driver.findElement(By.linkText("Sign in")).click();//Step 3 Click on Sign-in Button for Sing-in to the Gmail 
		driver.findElement(By.xpath("//span[text()='Email or phone']")).sendKeys("khansemu222@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//driver.quit();//close all windows what I opened 
		

	}

}
