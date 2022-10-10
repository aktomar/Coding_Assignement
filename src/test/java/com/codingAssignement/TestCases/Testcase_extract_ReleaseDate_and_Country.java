package com.codingAssignement.TestCases;

import org.testng.annotations.Test;

import com.codingAssignement.WebpageObject.ExtractDate_and_Country;

public class Testcase_extract_ReleaseDate_and_Country extends BaseClass{
	
	@Test
	public void Extract_ReleaseDate_and_Country() {
	
		ExtractDate_and_Country dtCon = new ExtractDate_and_Country(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//*[text()='December 17, 2021 (United States)']"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		Thread.sleep(5000);
		
		
		dtCon.ExtractReleaseDate();
		
		dtCon.ExtractCountry();
		

	}
	}
