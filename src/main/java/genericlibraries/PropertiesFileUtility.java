package genericlibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class contains all reusable methods to perform toperform opertions on properties file
 * @author teju
 */
public class PropertiesFileUtility {
Properties property;
/**
 * This method is used to initialize the  properties file
 * @paramfilepath
 */
public void propertyFileInitialization(String filepath)
{
	FileInputStream fis = null;
	try {
		fis = new FileInputStream(filepath);
	}
	catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	property = new Properties();
	try {
		property.load(fis);
	}catch(IOException e) {
		e.printStackTrace();
	}
}
/**
 * this method returns the data from properties file based on the key passed
 * @param key
 * @return
 */
   public String fetchProperty(String key) {
	return property.getProperty(key);
}}