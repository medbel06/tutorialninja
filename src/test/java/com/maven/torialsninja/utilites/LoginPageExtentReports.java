package com.maven.torialsninja.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LoginPageExtentReports {

	public static ExtentReports generateExtentReports() throws Exception {
		
		ExtentReports extentReport = new ExtentReports();
		
		File extentReportfile=new File(System.getProperty("user.dir")+"\\test-output\\extentReports\\extentReport.html");
		
		ExtentSparkReporter SparkReporter =new ExtentSparkReporter(extentReportfile);
		
		SparkReporter.config().setTheme(Theme.DARK);

		SparkReporter.config().setReportName("tutorial ninja login repot");
		SparkReporter.config().setDocumentTitle("tutorial ninja login automation test");
		SparkReporter.config().setTimeStampFormat("dd/MM/yy hh:mm:ss");
		extentReport.attachReporter(SparkReporter);
		
		Properties configprop=new Properties();
		FileInputStream ip =new FileInputStream(System.getProperty("user.dir")+"\\configuration\\config.properties");
		configprop.load(ip);
		
		
		extentReport.setSystemInfo("application url",configprop.getProperty("url") );
		extentReport.setSystemInfo("username",configprop.getProperty("username") );
		extentReport.setSystemInfo("password",configprop.getProperty("password") );
		
		
		return extentReport;

		
		
		
		
	}
	
}
