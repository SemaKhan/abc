package com.multycart.qa.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_win32\\chromedriver.exe");//Setup browser and driver path 
		WebDriver driver =new  ChromeDriver();//create an object of webdriver 
		driver.get("https://promo.bankofamerica.com/");
		driver.findElement(By.xpath("//span[@class='spa-btn spa-btn--primary spa-btn--medium masthead-cta-btn']")).click();
		driver.findElement(By.linkText("Overdraft Protection")).click();
		
		
	}}

	
