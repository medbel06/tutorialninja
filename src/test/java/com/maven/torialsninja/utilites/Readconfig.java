package com.maven.torialsninja.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	Properties pro;
	
	
	public Readconfig() {
		File src=new File("./configuration/config.properties");
		try {
			
			FileInputStream fis= new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
			
		}catch(Exception e) {
			
			System.out.println("exception :"+e.getMessage());
			
			
		}
		
		
		
	}
	
	public String getApplicationURL() {
		String url=pro.getProperty("url");
		return url;
		
	}
	
	public String getApplicationEmail() {
		String username=pro.getProperty("username");
		return username;
		
	}
	
	public String getApplicationinvalidEmail() {
		String username=pro.getProperty("invalidusername");
		return username;
		
	}
	public String getApplicationPassword() {
		String password=pro.getProperty("password");
		return password;
		
	}
	
	public String getApplicationinvalidPassword() {
		String password=pro.getProperty("invaldipassword");
		return password;
		
	}
	
	
	
}
