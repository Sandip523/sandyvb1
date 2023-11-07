package Library_Files_P2.P2_Adactine_Selenium_Maven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class UtilityClass 
{
    @Test
    public static String getDatafromPF(String key) throws IOException
    {
    	FileInputStream File = new FileInputStream("C:\\Users\\Server\\eclipse-workspace\\P2_Adactine_Selenium_Maven\\propertyFile.properties");
    	
    	Properties prop = new Properties();
    	
    	prop.load(File);
    	
    	String value=prop.getProperty(key);
    	
    	System.out.println(value);
    	
    	return value;
    }
}
