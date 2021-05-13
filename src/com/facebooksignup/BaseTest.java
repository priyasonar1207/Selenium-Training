package com.facebooksignup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest{

	static WebDriver driver = null;
	
	public void initialiseWebEnvironment(String strUrl) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"/src/ExternalResources/chromedriver.exe");
		driver = new ChromeDriver();
	     driver.get(strUrl);
	     driver.manage().window().maximize();
}
	
	//close Browser
public void teardown() {
		driver.close();
	}
}

	
	
	
	
	
	
	
