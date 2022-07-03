package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public static ConfigDataProvider config;
	public ExcelDataProvider excel;
	
	
	@BeforeSuite
	public void bs () throws Exception {
		 config=new ConfigDataProvider();
		 excel=new ExcelDataProvider();
	}
	
	@Parameters("browser")
	@BeforeMethod
	public void browserOpen(String browser) {
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver() ;
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(config.geturl());	
			
		} 
	}
	
	@AfterMethod
	public void browserClose()
	{
		//driver.close();
	}
	
}
