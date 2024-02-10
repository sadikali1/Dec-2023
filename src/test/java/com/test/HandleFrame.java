package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleFrame {
	
	@Test
	public void testIframe() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.switchTo().frame("frame1");
		WebElement el = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(el);
		
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		
		driver.switchTo().parentFrame();
		String text1 = driver.findElement(By.xpath("//div[@id=\"framesWrapper\"]/div[1]")).getText();
		System.out.println(text1);
	}

	
	@Test
	public void nestedIframe() {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("frame1");
		String text = driver.findElement(By.tagName("body")).getText();
		System.out.println(text);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		String text1 = driver.findElement(By.xpath("//p")).getText();
		System.out.println(text1);
		//driver.switchTo().parentFrame();
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		String text2 = driver.findElement(By.xpath("//div[@id=\"framesWrapper\"]/div[1]")).getText();
		System.out.println(text2);
	}

}
