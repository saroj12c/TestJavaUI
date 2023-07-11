package com.saroj.automation;

//Java Program to Illustrate Selenium Maven Project
//to Open Chrome Browser In Eclipse


//Importing required classes
import org.openqa.selenium.chrome.ChromeDriver;

//Class
public class Geeks {

	// Main driver method
	public static void main(String args[])
	{
		System.setProperty(
			"webdriver.chrome.driver",
			"C:\\Users\\shatr\\Downloads\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser
		// using maximize() method
		driver.manage().window().maximize();

		// Launching website
		driver.get("https://www.geeksforgeeks.org/");
		
		
		
		
	}
}
		
		
		
