package com.orglearningMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelloWorldTest {
	
@Test 
	public void Login() {
	 System.out.println("Logging into account");
	 System.setProperty("webdriver.chrome.driver", "https://github.com/yashbant/maventest/blob/master/lib/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://google.com");
}
}
