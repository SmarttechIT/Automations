package smarttech;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseConfig {
	
	public static String getConfigValue(String Value) {
		
		File file = new File("./Config.properties");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		Properties pro = new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pro.getProperty(Value);
		
		
	}
public static void main(String[] args) {
	BaseConfig.getConfigValue("URL");
	BaseConfig.getConfigValue("Username");
	BaseConfig.getConfigValue("PW");
	System.out.println(BaseConfig.getConfigValue("URL"));
	System.out.println(BaseConfig.getConfigValue("Username"));
	System.out.println(BaseConfig.getConfigValue("PW"));
	
	
	
}
}
