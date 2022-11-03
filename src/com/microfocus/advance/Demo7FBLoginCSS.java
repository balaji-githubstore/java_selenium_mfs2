package com.microfocus.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7FBLoginCSS {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://facebook.com/");
		
		WebElement ele= driver.findElement(By.cssSelector("#email"));
		ele.sendKeys("bala12333@gmail.com");
		
	
		driver.findElement(By.cssSelector("#pass")).sendKeys("welcome123");
		
		driver.findElement(By.cssSelector("[name='login']")).click();
		
		
		driver.quit();
	}

}
