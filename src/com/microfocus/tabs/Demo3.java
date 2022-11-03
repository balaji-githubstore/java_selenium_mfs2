package com.microfocus.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.db4free.net/");
		
		//click on phpMyAdmin »
		driver.findElement(By.partialLinkText("phpMyAd")).click();
		
		//switch to second tab
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(windows);
		
		
		for(String win : windows)
		{
			System.out.println(win);
			
			driver.switchTo().window(win);
			System.out.println(driver.getTitle());
			
			if(driver.getTitle().equals("phpMyAdmin"))
			{
				break;
			}
			System.out.println("------------------------");
		}

		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("input_username")).sendKeys("admin");
		driver.findElement(By.id("input_password")).sendKeys("admin123");
		driver.findElement(By.id("input_go")).click();

		String errorText = driver.findElement(By.id("pma_errors")).getText();
		System.out.println(errorText);
	}

}
