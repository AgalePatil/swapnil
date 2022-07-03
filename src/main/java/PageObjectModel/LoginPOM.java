package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPOM {
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//a[text()='Create Account']")
	private	WebElement creatacc;
	
	@FindBy(how=How.XPATH,using="(//input[contains(@name,'nam')])[1]")
	private	WebElement fullname;
	
	@FindBy(how=How.XPATH,using="//input[contains(@name,'login')]")
	private	WebElement rediffmailid;
	
	@FindBy(how=How.XPATH,using="(//input[contains(@name,'pass')])[1]")
	private	WebElement pass;
	
	@FindBy(how=How.XPATH,using="//input[contains(@name,'confirm_pa')]")
	private	WebElement retypepass;
	
	@FindBy(how=How.XPATH,using="(//input[contains(@name,'altemai')])[1]")
	private	WebElement alternateemail;
	
	@FindBy(how=How.XPATH,using="//input[@id='mobno']")
	private	WebElement mobile;
	
	public LoginPOM(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getcreatacc(){
		return creatacc;
	}
	public WebElement getfullname(){
		return fullname;
	}
	public WebElement getrediffmailid(){
		return rediffmailid;
	}
	public WebElement getpassk(){
		return pass;
	}
	public WebElement getretypepass(){
		return retypepass;
	}
	public WebElement getalternateemail(){
		return alternateemail;
	}
	public WebElement getmobile(){
		return mobile;
	}
}
