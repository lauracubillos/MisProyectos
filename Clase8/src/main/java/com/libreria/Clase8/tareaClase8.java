package com.libreria.Clase8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class tareaClase8 {
	private WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void lanzarNavegador(String navegador) {

		navegador = navegador.toLowerCase();
		switch (navegador) {
		case "google":
			System.setProperty("webdriver.chrome.driver", ".\\src\\main\\java\\resources\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", ".\\src\\main\\java\\resources\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			break;
		case "ie":
			String rutaDriver = ".\\src\\main\\java\\resources\\Drivers\\IEDriverServer.exe";
			System.setProperty("webdriver.IE.DriverServer", rutaDriver);
			InternetExplorerOptions options = new InternetExplorerOptions();
			options.ignoreZoomSettings();
			options.introduceFlakinessByIgnoringSecurityDomains();
			options.enablePersistentHovering();
			options.disableNativeEvents();
			driver = new InternetExplorerDriver(options);
		

			break;

		default:

			break;

		}
	}//Method lanzarNavegador
	
	public void navegarA(String url) {
		driver.get(url);
		
	}
	public void cierreNavegador() {
		driver.close();
	}
}


