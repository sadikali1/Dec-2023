package com.test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {

	@Test()
	public void testCapturePage() throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		File file = driver.getScreenshotAs(OutputType.FILE);
		File file1 = new File("abc.png");
		FileUtils.copyFile(file, file1);
	}
	
	@Test()
	public void testCaptureElement() throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		WebElement  element = driver.findElement(By.xpath("//button[@name='login']"));
		
		File file = element.getScreenshotAs(OutputType.FILE);
		File file1 = new File("button.png");
		FileUtils.copyFile(file, file1);
	}
	
}
