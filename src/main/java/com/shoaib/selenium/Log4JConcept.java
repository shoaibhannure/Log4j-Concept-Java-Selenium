package com.shoaib.selenium;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Log4JConcept {

	public static void main(String[] args) {

		// What is log? : capturing info/activities at the time of program
		// execution.
		// types of logs:
		// 1. info
		// 2. warn
		// 3. debug
		// 4. fatal

		// how to generate the logs? : use Apache log4j API (log4j jar)
		// How it works? : it reads log 4j configuration from log4j.properties
		// file
		// where to create: create inside resources folder

		WebDriver driver;
		Logger log = Logger.getLogger(Log4JConcept.class);
		log.info("****************************** Starting Automation Process  *****************************************");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();// launch browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.freshworks.com/");

		log.info("entering application URL");
		log.warn("Hey this just a warning message");
		log.fatal("hey this is just fatal error message");
		log.debug("this is debug message");

		String titleOfPage = driver.getTitle();
		// In Industry instead of sysout we use log.info
		log.info("Title of Page is  " + titleOfPage);

		log.info("****************************** End of Log4J Concept *****************************************");
	}

}
