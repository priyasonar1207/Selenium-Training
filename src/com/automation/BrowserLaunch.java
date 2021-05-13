package com.automation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
	 WebDriver driver = null;
	
	public void initialiseWebEnvironment() {
		System.setProperty("webdriver.chrome.driver",
		        System.getProperty("user.dir")+"/src/ExternalResources/chromedriver.exe");
		driver = new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	     
	}
	

	public void setUserEmailid() {
		driver.findElement(By.id("email")).sendKeys("Priyasonar1207@gmail.com");
		}
	
	
	public void setUserPassword() {
	driver.findElement(By.id("pass")).sendKeys("Priya123");
	}
	
	public void teardown() {
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
		driver.close();
	}
	
	public static void main(String[] args) {
	
		BrowserLaunch objBrowserLaunch =new BrowserLaunch();
		objBrowserLaunch.initialiseWebEnvironment();
		objBrowserLaunch.setUserEmailid();
		objBrowserLaunch.setUserPassword();
		//objBrowserLaunch.teardown();

	}

}
