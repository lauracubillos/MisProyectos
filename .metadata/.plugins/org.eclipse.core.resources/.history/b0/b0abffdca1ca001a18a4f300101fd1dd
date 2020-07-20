package com.libreria.clase7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	WebDriver driver;
	
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

	public void navegadorExplorer() {
			String rutaDriver = ".\\src\\main\\java\\resources\\Drivers\\IEDriverServer.exe";
	    	System.setProperty("webdriver.IEDriverServer.driver", rutaDriver);
			driver = new ExplorerDriver();	
			driver.get("https://www.google.com/");
			driver.close();
	}
}
