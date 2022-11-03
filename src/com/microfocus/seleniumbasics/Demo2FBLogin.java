package com.microfocus.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
//		driver.findElement(By.id("email")).sendKeys("bala12345@gmail.com");
		
//		By loc= By.id("email");
//		WebElement ele= driver.findElement(loc);
//		ele.sendKeys("bala12333@gmail.com");
		
		WebElement ele= driver.findElement(By.id("email"));
		ele.sendKeys("bala12333@gmail.com");
		
		
		
		driver.findElement(By.id("pass")).sendKeys("welcome123");
		
		driver.findElement(By.name("login")).click();
		
		
		driver.quit();
	}

}
