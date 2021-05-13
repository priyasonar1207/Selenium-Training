package com.facebooksignup;
import org.openqa.selenium.By;

public class FacebookSignPage {

		WrapperFunction objWrapperFunction= new WrapperFunction();
		
			//set first name 
			public void setFirstName(String strFirstName) {
				BaseTest.driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(strFirstName);
		    }
			

			//set surname
			public void setLastName(String strLastName) {
				BaseTest.driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(strLastName);
			}


			//set Mobile number
			public void setMobileNumber(String strMobileNumber) {
				BaseTest.driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(strMobileNumber);
			}

			
			//set password
			public void setPassword(String strPassword) {
				BaseTest.driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(strPassword);
			}
			
			
			//set birth date
			public void setBirthdate(String strDrpDayOption) {
				By drpBirthDay= By.xpath("//select[@name='birthday_day']");
				objWrapperFunction.selectValueFromdropdown(drpBirthDay,strDrpDayOption);
				}
			
			
			//set birth month
			public void setBirthMonth(String strDrpMonthOption) {
				By drpBirthMonth= By.xpath("//select[@name='birthday_month']");
				objWrapperFunction.selectValueFromdropdown(drpBirthMonth, strDrpMonthOption);
				}
			
			
			//set birth year
			public void setBirthYear(String strDrpYearOption) {
				By drpBirthYear= By.xpath("//select[@name='birthday_year']");
				objWrapperFunction.selectValueFromdropdown(drpBirthYear, strDrpYearOption);
				}
			
			
			//select gender
			public void clickUserGender(String strGender) {
				
			if(strGender.equalsIgnoreCase("female")) {
				BaseTest.driver.findElement(By.xpath("//label[text()='Female']")).click();
			}	
			else if (strGender.equalsIgnoreCase("male")) {
				BaseTest.driver.findElement(By.xpath("//label[text()='Male']")).click();
			}
			else {
				BaseTest.driver.findElement(By.xpath("//label[text()='Custom']")).click();
			}
		}
			
			
			//click on sign up
			public void clickonSignUp() {
				BaseTest.driver.findElement(By.xpath("//button[@name='websubmit']")).click();
				}
			
      }


			


//select gender
/*public void clickonGender() {
	
	WebElement radio1 = BaseTest.driver.findElement(By.xpath("//label[text()='Female']"));
	WebElement radio2 = BaseTest.driver.findElement(By.xpath("//label[text()='Male']"));
	WebElement radio3 = BaseTest.driver.findElement(By.xpath("//label[text()='Custom']"));

	radio2.click();
}*/








