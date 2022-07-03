package Utility;

import java.io.File;
import java.io.FileInputStream;


import java.util.Properties;

public class ConfigDataProvider {
	public Properties p;
	
	
	public ConfigDataProvider() throws Exception {
		
		String path="C:\\Users\\swapn\\eclipse-workspace\\HybridTest\\Config\\DATA.properties";
		File src=new File(path);
		FileInputStream file=new FileInputStream(src);
		p=new Properties();
		
		p.load(file);
	}
	
	public String geturl() {
		return p.getProperty("url");
	}
	public String getfullname() {
		return p.getProperty("FullName");
	}
	public String getRediffmailID() {
		return p.getProperty("RediffmailID");
	}
	public String getPassword() {
		return p.getProperty("Password");
	}
	public String getRetypepassword() {
		return p.getProperty("Retypepassword");
	}
	public String getMobile() {
		return p.getProperty("Mobile");
	}
}
