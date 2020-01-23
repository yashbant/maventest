package com.orglearningMaven;

import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldTest {
	WebDriver driver;
@Test 
	public void Login() {
	//String projectLocation = System.getProperty("user.dir");
	 System.out.println("Logging into account");
	 System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://google.com");
}

public void setup() {
	System.out.println("**");
	System.out.println("launching chrome browser");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();	
}

@Test
public void testPageTitleSampleA() {
	driver.navigate().to("http://www.google.com");
	String strPageTitle = driver.getTitle();
	System.out.println("Page title: - "+strPageTitle);
	Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
}
@Test
public void testSampleThree() {
	System.out.println("Im in test sample three");
}

@AfterClass
public void tearDown() {
	if(driver!=null) {
		System.out.println("Closing firefox browser");
		driver.quit();
	}


}
}
