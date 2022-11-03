package com.microfocus.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9JS2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.redbus.in/");
		
	//	driver.findElement(By.id("checkin")).sendKeys("04-11-2022");
		
		WebElement ele=driver.findElement(By.xpath("//*[@id='onward_cal']"));
		driver.executeScript("arguments[0].value='30-Oct-2022'",ele);

	}

}
