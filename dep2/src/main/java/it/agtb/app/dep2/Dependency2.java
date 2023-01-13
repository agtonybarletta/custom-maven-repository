package it.agtb.app.dep2;

import java.io.IOException;
import java.util.Properties;

public class Dependency2{
	public String fn(){

		String version = "";
		Properties prop = new Properties();
		try {
    		//load a properties file from class path, inside static method
    		prop.load(Dependency2.class.getClassLoader().getResourceAsStream("app.properties"));
			version = prop.getProperty("version");
        	 return "Hello World from Dependency2 fn with version: "+ version;

		} 
		catch (IOException ex) {
			ex.printStackTrace();
		}
		return "";
	}
}
