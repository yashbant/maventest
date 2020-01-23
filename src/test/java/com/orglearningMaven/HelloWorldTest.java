package com.orglearningMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelloWorldTest {
	
@Test 
	public void Login() {
	String projectLocation = System.getProperty("user.dir");
	 System.out.println("Logging into account");
	 System.setProperty("webdriver.chrome.driver", projectLocation+"\\lib\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://google.com");
}
}
