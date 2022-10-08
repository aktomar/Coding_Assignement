package com.codingAssignement.TestCases;

import org.testng.annotations.Test;

import com.codingAssignement.WebpageObject.ExtractDate_and_Country;

public class Testcase_extract_ReleaseDate_and_Country extends BaseClass{
	
	@Test
	public void Extract_ReleaseDate_and_Country() {
	
		ExtractDate_and_Country dtCon = new ExtractDate_and_Country(driver);
		
		dtCon.ExtractReleaseDate();
		
		dtCon.ExtractCountry();
		

	}
	}
