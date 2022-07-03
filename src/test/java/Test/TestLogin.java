package Test;

import org.apache.xmlbeans.impl.xb.xmlconfig.impl.ConfigDocumentImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Config;

import PageObjectModel.LoginPOM;
import Utility.BaseClass;
import Utility.Library;

public class TestLogin extends BaseClass{

	
	@Test
	public void login() throws Exception   {
		LoginPOM l=PageFactory.initElements(driver, LoginPOM.class);
		
		Library.CustomClick(l.getcreatacc(), "Creat Account");
		Library.CustomSendkeys(l.getfullname(), config.getfullname(), "Full Name");
		
		Library.CustomSendkeys(l.getrediffmailid(), excel.getStringdata("Sheet1", 0, 1), "RedigffMail ID");
		Library.CustomSendkeys(l.getpassk(), config.getPassword(), "password");
		Library.CustomSendkeys(l.getretypepass(), config.getRetypepassword(),"retye");
		Library.CustomSendkeys(l.getmobile(), config.getMobile(), "mobile no.");
		
		Thread.sleep(4000);
	}
}
