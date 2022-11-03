package com.microfocus.seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.facebook.com/");

		// click on Create New Account
		driver.findElement(By.linkText("Create New Account")).click();

		// Enter FirstName as john
		driver.findElement(By.name("firstname")).sendKeys("John");
		
		//enter lastname as wick
		driver.findElement(By.name("lastname")).sendKeys("wick");
		
		//enter password as welcome123
		driver.findElement(By.id("password_step_input")).sendKeys("welcome122");
		
		//20 Dec 2000
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("20");
		
		//select month Dec 
		Select selectMon=new Select(driver.findElement(By.id("month")));
		selectMon.selectByVisibleText("Dec");
		
		//select year as 2000
		Select selectYear=new Select(driver.findElement(By.id("year")));
		selectYear.selectByVisibleText("2000");
		
		//click on custom radio button
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		//click on sign up 
		driver.findElement(By.name("websubmit")).click();
		
	}

}


