package com.libreria.Clase8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Tarea Clase 8!
 *
 */
public class App 
{
	public static void main( String[] args ){
	    Driver objDriver = new  Driver();
	   objDriver.lanzarNavegador("google");
	   objDriver.navegarA("https://www.google.com/");
	   WebElement cajatexto = objDriver.getDriver().findElement(By.name("q"));
	   cajatexto.sendKeys("Sophos Chronus");
	   cajatexto.submit();
	 
	   
	 
	   try {
		   Thread.sleep(5000);
	   }catch (Exception e) {
		   
	   }

	   objDriver.cierreNavegador();
	    	
	      
	    }
	}

//Clase 8
//    public static void main( String[] args ){
//    Driver objDriver = new  Driver();
//   objDriver.lanzarNavegador("google");
//   objDriver.navegarA("https://www.google.com/");
//   WebElement cajatexto = objDriver.getDriver().findElement(By.name("q"));
//   cajatexto.sendKeys("Html");
//   WebElement cajatexto2 = objDriver.getDriver().findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
//   cajatexto2.sendKeys("5");
//   cajatexto2.submit();
// 
//   
// 
//   try {
//	   Thread.sleep(5000);
//   }catch (Exception e) {
//	   
//   }
//
//   objDriver.cierreNavegador();
//    	
//      
//    }
//}