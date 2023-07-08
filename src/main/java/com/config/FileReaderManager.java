package com.config;

public class FileReaderManager {

	
	public static String getBrowserName() {
		return ConfigReader.propFileReader().getProperty("browser");
	}
	public static String getUrl() {
		return ConfigReader.propFileReader().getProperty("url");
	}
	public static String getFirstName() {
		return ConfigReader.propFileReader().getProperty("firstName");
	}
	public static String getLastName() {
		return ConfigReader.propFileReader().getProperty("lastName");
	}
	public static String getEmail() {
		return ConfigReader.propFileReader().getProperty("email");
	}
	public static String getPhone() {
		return ConfigReader.propFileReader().getProperty("phone");
	}
	public static String getPassword() {
		return ConfigReader.propFileReader().getProperty("password");
	}
	 
}
