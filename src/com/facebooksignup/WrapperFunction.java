package com.facebooksignup;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WrapperFunction {

	public void setImplicitWait(int intWait) {
		
          BaseTest.driver.manage().timeouts().implicitlyWait(intWait,TimeUnit.SECONDS);
		}
			
		
	//for selecting values from dropdown
	public static WebElement getWebElement(By locator) {
		return BaseTest.driver.findElement(locator);
	}
	
	public void selectValueFromdropdown(By locator,String strValue) {
		
		try {
			Select dropdown = new Select(getWebElement(locator));
		dropdown.selectByVisibleText(strValue);
	
		}catch(Exception e) {
			
			System.out.println("Webdriver could'nt locate the element");
			
		}
	}
}

	
	
	
	
	
	
	
	
	
	/*public void clickonGender() {
		
		try {
			
			BaseTest.driver.findElement(By.xpath("//input[@type='radio']")).click();
			selectRadioButton(BaseTest.driver,"Custom");
			Thread.sleep(2000);
			selectRadioButton(BaseTest.driver,"Male");
			Thread.sleep(2000);
			selectRadioButton(BaseTest.driver,"Female");
			Thread.sleep(2000);
		}catch(Exception e){
			
			e.printStackTrace();
			
			}
	}

	private void selectRadioButton(WebDriver driver, String value) {
	System.out.println("Value: "+value);
		WebElement r = BaseTest.driver.findElement(By.xpath(""));
		System.out.println("Before: "+r.isSelected());
		if(!(r.isSelected())){
		r.click();
		}
	System.out.println("After:"+r.isSelected());
	}
	
}*/
	
	
	

