package com.codingAssignement.WebpageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExtractDate_and_Country {
	
	WebDriver ldriver;
	
	public ExtractDate_and_Country(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
		
	}
	
	@FindBy(xpath="//*[text()='December 17, 2021 (United States)']")
	@CacheLookup
	WebElement ReleaseDate;
	
	@FindBy(xpath="//*[text()='India']")
	@CacheLookup
	WebElement Country;
	
	
	public void ExtractReleaseDate() {
		
		String Date = ReleaseDate.getText();
		System.out.println("ReleaseDate -->> "+Date);
				
	}
	
    public void ExtractCountry() {
		
		String Coutry = Country.getText();
		System.out.println("Country -->> "+Coutry);
				
	}
	
	
	
	
	

}
