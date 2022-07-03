package Utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

public class Library {

	
	public static void CustomSendkeys(WebElement element, String value, String FieldName) {
	
		try {
			element.sendKeys(value);
			ObjectRepo.Test.log(Status.PASS, "value send sucessfully" +FieldName);
		}catch(Exception e) {
			//System.out.println("value not send"+e);
			ObjectRepo.Test.log(Status.FAIL, "value cant send"+FieldName+e);
		}
	
	}
	
	public static void CustomClick(WebElement element, String FieldName) {
		try {
			element.click();
			ObjectRepo.Test.log(Status.PASS, "sucessfully click"+FieldName);
		}catch(Exception e) {
			//System.out.println("unable to click"+e);
			ObjectRepo.Test.log(Status.FAIL, "cant click"+FieldName+e);
		}
	
	}
}
