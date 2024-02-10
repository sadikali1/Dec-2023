package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBox {

	@Test()
	public void checkBox() {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/checkbox");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		boolean status1 = driver.findElement(By.xpath("//input[@id='tree-node-home']")).isSelected();
		System.out.println(status1);
		driver.findElement(By.xpath("//span[text()='Home']")).click();
		
		boolean status2 = driver.findElement(By.xpath("//input[@id='tree-node-home']")).isSelected();
		System.out.println(status2);
		
	}
}
