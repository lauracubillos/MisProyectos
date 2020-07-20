package com.libreria.clase7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
	WebDriver driver;
	public Driver() {
		
	}
		
	
	
	public void navegadorGoogle() {
		String rutaDriver = ".\\src\\main\\java\\resources\\Drivers\\chromedriver.exe";
    	System.setProperty("webdriver.chrome.driver", rutaDriver);
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}

	public void navegadorFireFox() {
			String rutaDriver = ".\\src\\main\\java\\resources\\Drivers\\geckodriver.exe";
	    	System.setProperty("webdriver.gecko.driver", rutaDriver);
			driver = new FirefoxDriver();	
			driver.get("https://www.google.com/");
			driver.close();
			
		}

	public void navegadorInternetExplorer() {
			String rutaDriver = ".\\src\\main\\java\\resources\\Drivers\\IEDriverServer.exe";
	    	System.setProperty("webdriver.IE.DriverServer", rutaDriver);
			driver = new InternetExplorerDriver();	
			driver.get("https://www.google.com/");
			driver.close();
	}

}
