package com.amazon.genericLibraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileLibrary {
	 public String getPropKeyValue(String propPath, String Key) throws IOException {
	        FileInputStream fis = new FileInputStream(propPath);
	        Properties prop = new Properties();
	        prop.load(fis);
	        String propValue = prop.getProperty(Key, "Incorrect Key");
	        return propValue;
	    }

}
