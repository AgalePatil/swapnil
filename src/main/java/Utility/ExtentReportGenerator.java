package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	public static ExtentReports extent;
	
	public static ExtentReports extentreport() {
		
		String path="C:\\Users\\swapn\\eclipse-workspace\\HybridTest\\Report\\Index.html";
		ExtentSparkReporter repoter=new ExtentSparkReporter(path);	//class
		repoter.config().setDocumentTitle("Test Execution Report");
		repoter.config().setReportName("Automation Test Report");
		repoter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(repoter);
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("QA", "swapnil");
		
		return extent;
	}
	

}
