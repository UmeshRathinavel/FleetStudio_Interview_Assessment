package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void getDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	}

	public static void urlLaunch(String url) {
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static void elementClick(WebElement element) {
		element.click();
	}
	
	public static void inputToElement(WebElement element,String input) {
		element.sendKeys(input);
	}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void explicitWait(WebElement element) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(element));
	}

	public static String getPageTitle() {
		return driver.getTitle();
	}
	
	public static void screenshot(String fileName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File img = ts.getScreenshotAs(OutputType.FILE);
		File loc = new File(System.getProperty("user.dir")+"\\ScreenShots\\"+fileName+"."+"png");
		try {
			FileHandler.copy(img, loc);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
