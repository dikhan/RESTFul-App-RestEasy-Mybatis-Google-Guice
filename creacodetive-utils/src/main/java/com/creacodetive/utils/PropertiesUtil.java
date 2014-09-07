package com.creacodetive.utils;

import java.net.URL;
import java.util.Properties;

import org.apache.commons.configuration.ConfigurationConverter;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * Class in charge of Properties Management.
 * 
 * @author Daniel Isaac Khan Ramiro (di.khan.r@gmail.com)
 */
public class PropertiesUtil {
	
	private static PropertiesUtil instance = new PropertiesUtil();

	private PropertiesUtil() {}

	public static PropertiesUtil getInstance() {
		return instance;
	}

	public Properties loadProperties(String propsName) {
		PropertiesConfiguration configuration = null;
		try {
			URL url = getClass().getResource(propsName);
			if (url == null)
				configuration = new PropertiesConfiguration(propsName);
			else
				configuration = new PropertiesConfiguration(url);
			return ConfigurationConverter.getProperties(configuration);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}
