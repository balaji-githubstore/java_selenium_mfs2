package com.microfocus.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo8JS {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.redbus.in/");
		
		
	//	driver.findElement(By.id("checkin")).sendKeys("04-11-2022");
		
//		driver.findElement(By.id("signInLink")).click();
		
//		driver.executeScript("document.querySelector('#signInLink').click()");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('#onward_cal').value='30-Oct-2022'");
		
		

	}

}
