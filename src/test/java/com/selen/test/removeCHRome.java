package com.selen.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class removeCHRome {
   public static void main(String[] args) {
	  
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			
			options.addArguments("Start-maximized");
			options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
			WebDriver driver = new EdgeDriver(options);
			
			driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
			driver.quit();
	 }
    
}

