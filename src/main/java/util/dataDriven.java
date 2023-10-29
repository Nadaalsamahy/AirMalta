package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class dataDriven {

	public static Object fetchPropertyValue(String key) throws IOException{
		FileInputStream file =new FileInputStream("./config/config.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(key);
	}
}
