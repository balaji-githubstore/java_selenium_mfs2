package com.microfocus.advance;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo11Options {

	public static void main(String[] args) {
		
		File file1=new File("download");
		String path=file1.getAbsolutePath();
		System.out.println(path);
		
	System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		
		ChromeOptions option=new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", path);
		
		option.setExperimentalOption("prefs", prefs);
		
		
		WebDriver driver = new ChromeDriver(option);
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.selenium.dev/downloads/");
		
		driver.findElement(By.partialLinkText("32 bit")).click();
		
//		driver.quit();

	}

}
