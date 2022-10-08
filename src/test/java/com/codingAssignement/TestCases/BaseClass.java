package com.codingAssignement.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



public class BaseClass {
	
	WebDriver driver;

	
		@Parameters("browser")
		@BeforeClass
		public void Setup(String br) {
			

			if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
			}
			else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if(br.equals("IE")){
				System.setProperty("webdriver.ie.driver","./Drivers/msedgedriver.exe");
				driver = new InternetExplorerDriver();
			}
			//Opening application url..
			driver.manage().window().maximize();
			

			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("https://www.imdb.com/title/tt9389998/");
			

			
					
		}
		
		@AfterClass
		public void tearDown() 
		{
			driver.quit();
		}
			
			
	

	


}
