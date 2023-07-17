package com.saroj.automation;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp15july23 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\shatr\\Downloads\\chromedriver_win32.exe");

		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.iibf.org.in/");
		
		driver.manage().window().maximize();
		
		//Alert alert = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@id = 'btnCloseNotice' ])[3]")).click();
		
		
		//alert.accept();
		
		//alert.dismiss();
		
		
		
		
		
		
		
		
	}

}
