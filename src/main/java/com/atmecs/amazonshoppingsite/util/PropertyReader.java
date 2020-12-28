package com.atmecs.amazonshoppingsite.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader 
{
	public static Properties props;
	public static Properties readProperty(String filePath)
	{
		props = new Properties();
		
		try 
		{
			props.load(new FileInputStream(filePath));
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return props;
	}
}
