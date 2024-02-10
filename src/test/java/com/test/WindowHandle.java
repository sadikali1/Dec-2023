package com.test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle {

	@Test()
	public void testWindowHandle() {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("tabButton")).click();
		String winodId = driver.getWindowHandle();
		Set<String> windIds = driver.getWindowHandles();
		for(String win : windIds) {
			driver.switchTo().window(win);
		}
		
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		driver.close();
		
		driver.switchTo().window(winodId);
		driver.findElement(By.id("windowButton")).click();
	}
	
	@Test()
	public void testHandle() {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.selenium.dev/documentation/webdriver/interactions/windows/");
	}
}
