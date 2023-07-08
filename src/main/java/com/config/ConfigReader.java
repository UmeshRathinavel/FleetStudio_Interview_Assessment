package com.config;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	static FileReader fis;
	static Properties prop ;
	public static Properties propFileReader() {
		prop = new Properties();
		
		File f = new File("D:\\Avadi\\workspace1\\Fleet_Studio\\Fleet_Studio\\src\\main\\java\\fleet.properties");
		
		try {
			 fis = new FileReader(f);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			prop.load(fis);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
			
		
	}
	
	
	
	
	

}
