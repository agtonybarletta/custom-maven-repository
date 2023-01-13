package it.agtb.app;
import java.io.IOException;
import java.util.Properties;

import it.agtb.app.dep1.*;
import it.agtb.app.dep2.Dependency2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
		Dependency1 dep1 = new Dependency1();
		Dependency2 dep2 = new Dependency2();

		String version = "";
		Properties prop = new Properties();
		try {
    		//load a properties file from class path, inside static method
    		prop.load(App.class.getClassLoader().getResourceAsStream("app.properties"));
			version = prop.getProperty("version");
        	System.out.println( "Hello World from App with version: "+ version);

		} 
		catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println( "Message from Dep1 "+ dep1.fn() );
		System.out.println( "Message from Dep2 "+ dep2.fn() );
    }
}
