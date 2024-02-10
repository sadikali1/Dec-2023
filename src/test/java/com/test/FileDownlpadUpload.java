package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileDownlpadUpload {

	@Test()
	public void testUploadDown() {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/upload-download");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("downloadButton")).click();
		
		driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\admin\\Downloads\\sampleFile.jpeg");
	}
}
