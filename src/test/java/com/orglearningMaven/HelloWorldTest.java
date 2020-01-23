package com.orglearningMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelloWorldTest {
	
@Test 
	public void Login() {
	 System.out.println("Logging into account");
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\BioQuest Win\\eclipse-workspace\\myMavenProject\\lib\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://google.com");
}
}
