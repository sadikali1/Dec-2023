package com.test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {

	@Test()
	public void testWindowHandle() {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> elements= driver.findElements(By.xpath("//div[@role='gridcell']"));
		System.out.println(elements.size());
		for(WebElement element : elements) {
			System.out.println(element.getText());
		}
		
	}
}
