package com.BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {

	protected static WebDriver driver;

	public static void iniliazation() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//AllDrivers//chromedriver.exe");

		ChromeOptions opt =new ChromeOptions();
		//opt.addArguments("--Incognito");
		opt.addArguments("--headless");		
		driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		
	}

}
