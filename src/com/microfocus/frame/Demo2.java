package com.microfocus.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//switch to frame using index
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		driver.switchTo().frame(0);

		// enter user id as test123
		driver.findElement(By.name("fldLoginUserId")).sendKeys("john123");
		// click on continue
		driver.findElement(By.linkText("CONTINUE")).click();

		// come to main html
		driver.switchTo().defaultContent();

	}

}
