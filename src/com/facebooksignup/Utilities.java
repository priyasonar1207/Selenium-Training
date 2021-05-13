package com.facebooksignup;
import java.text.DecimalFormat;
import java.util.Random;

public class Utilities {

			static String strcharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		
		
		// random string
		public String getRandomString(int intCount) {
			StringBuilder sb = new StringBuilder();
			while (intCount-- != 0) {
					int intCharacter = (int)(Math.random()*strcharacters.length());
					sb.append(strcharacters.charAt(intCharacter));
			}
		return sb.toString();
		} 	
		
		
		//  random number 
		public int getRandomNumber(int intFrom, int intTo) {		
				int intRandomNumber;
				do {
					intRandomNumber= (int)(Math.random()*(intTo - intFrom))
								+ intFrom;
				}while(intRandomNumber == 0);
				return intRandomNumber;
			
			}
			
		
			// Random emaild id 
		public String getRandomEmailId() {
			// TODO Auto-generated method stub
			return getRandomString(7) + getRandomNumber(0, 9) + "@gmail.com";
		}
		
		
		// Random Mobile Number
		 public String getMobileNumber(){
			int intNum = random.nextInt(1000000000);
			DecimalFormat df = new DecimalFormat("000000000"); //remaining 9 digits
			String strPhoneNumber = getRandomNumber(7,9) + df.format(intNum);
			return strPhoneNumber;
		}
	}

	    
		    
		    
		    
		    
		
		    
		        
		 
