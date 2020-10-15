package com.multycart.qa.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumNexttech {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chrome_win32\\chromedriver.exe");//Setup browser and driver path
		WebDriver driver = new ChromeDriver();//create object of webdriver 
		//step one launch browser 
		driver.get("https://www.dell.com/en-us/cp/paid-search-splitter?gacd=9684992-1017-5761040-266906002-0&dgc=st&&gclid=Cj0KCQjwhb36BRCfARIsAKcXh6HJdP8D4-yd5JYZYWpcadTpfpZ309hYtGJO0fsPgA63aXQlVxlIKkIaAtLKEALw_wcB&gclsrc=aw.ds");
		//step 2 enter browser 
		driver.findElement(By.id("searchterms")).sendKeys("XPS");//step 2 enter xps in search button 
		driver.findElement(By.xpath("//span[text()='Search']")).click();//step 3 click on search button 
		
		//driver.close(); //step 5 close the application 

	}

}
