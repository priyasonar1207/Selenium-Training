package com.facebooksignup;

public class TestFacebook  {

	
	public static void main(String[] args) {
		
		Utilities objUtilities = new Utilities();
		WrapperFunction objWRapperFunction = new WrapperFunction();
		FacebookSignPage objFacebookSignPage = new FacebookSignPage();
		BaseTest objBaseTest = new BaseTest();
		
		objBaseTest.initialiseWebEnvironment("https://www.facebook.com/r.php");
		objWRapperFunction.setImplicitWait(10);
		
		objFacebookSignPage.setFirstName(objUtilities.getRandomString(6));
		objFacebookSignPage.setLastName(objUtilities.getRandomString(8));
		objFacebookSignPage.setMobileNumber(objUtilities.getMobileNumber());
		objFacebookSignPage.setPassword("Priya@1233");
		objWRapperFunction.setImplicitWait(10);
		
		objFacebookSignPage.setBirthdate(Integer.toString(18));
		objFacebookSignPage.setBirthMonth("Jul");
		objFacebookSignPage.setBirthYear(Integer.toString(1997));
		objWRapperFunction.setImplicitWait(10);
		
		objFacebookSignPage.clickUserGender("female");
		objFacebookSignPage.clickonSignUp();
		
	}

}

