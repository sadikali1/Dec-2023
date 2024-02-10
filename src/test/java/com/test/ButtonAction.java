package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ButtonAction {

	@Test()
	public void testActionsButton() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/buttons");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		Actions action = new Actions(driver);
		WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(doubleClick).build().perform();
		
		WebElement rightCLick = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(rightCLick).build().perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement singleClick = driver.findElement(By.xpath("//button[text()='Click Me']"));
		js.executeScript("arguments[0].scrollIntoView(true)", singleClick);
		action.click(singleClick).build().perform();
		
	}
	
	@Test()
	public void testDragDrop() {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/droppable");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		Actions action = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		action.dragAndDrop(source, target).build().perform();
	}
	
	@Test()
	public void testDragDropByPosition() {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/dragabble");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		Actions action = new Actions(driver);
		WebElement source = driver.findElement(By.id("dragBox"));
		action.dragAndDropBy(source, 200, 200).build().perform();
	}
	
	@Test
	public void testMouseHover() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(4000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Main Item 2']")))
			.pause(1000).moveToElement(driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']")))
			.pause(1000).click(driver.findElement(By.xpath("//a[text()='Sub Sub Item 2']"))).build().perform();
	}
}
