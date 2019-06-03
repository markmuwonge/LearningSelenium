package com.qa.LearningSelenium_Tests;


import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ASeleniumTest {
	
	String url = "https://www.google.co.uk";
	static WebDriver driver;
	
	@BeforeClass
	public static void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\LearningSelenium\\src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public static void teardown()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
	@Ignore
	public void test1()
	{
		driver.get(url);
		WebElement webElement = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
		webElement.sendKeys("cute kittens");
		webElement.submit();
			
		webElement =  driver.findElement(By.xpath("//*[@id=\"rhs_block\"]/div/div/div[2]"));
		
		assertEquals("Cute kittens", webElement.getText());		
	}
	
	@Test
	public void test2()
	{
		driver.get("https://www.youidraw.com/apps/painter/");
		WebElement webElement = driver.findElement(By.xpath("//*[@id=\"toolbox_paint\"]/table/tbody/tr[3]/td"));
		webElement.click();
		
		Actions action = new Actions(driver);
		
		//M
		action.moveByOffset(200, 200).perform();
		
		action.clickAndHold().perform();
		action.moveByOffset(0, 100).perform();
		action.release().perform();
		
		action.clickAndHold().perform();
		action.moveByOffset(0, -100).perform();
		action.release().perform();
		
		action.clickAndHold().perform();
		action.moveByOffset(50, 0).perform();
		action.release().perform();
		
		action.clickAndHold().perform();
		action.moveByOffset(0, 50).perform();
		action.release().perform();
		
		action.clickAndHold().perform();
		action.moveByOffset(0, -50).perform();
		action.release().perform();
		
		action.clickAndHold().perform();
		action.moveByOffset(50, 0).perform();
		action.release().perform();
		
		action.clickAndHold().perform();
		action.moveByOffset(0, 100).perform();
		action.release().perform();
		
		action.clickAndHold().perform();
		action.moveByOffset(0, -100).perform();
		action.release().perform();
		
		//A
		
		action.moveByOffset(50, 0).perform();
		
		action.clickAndHold().perform();
		action.moveByOffset(0, 100).perform();
		action.release().perform();
		
		action.clickAndHold().perform();
		action.moveByOffset(0, -100).perform();
		action.release().perform();
		
		action.clickAndHold().perform();
		action.moveByOffset(50, 0).perform();
		action.release().perform();
		
		action.clickAndHold().perform();
		action.moveByOffset(0, 100).perform();
		action.release().perform();
		
		action.clickAndHold().perform();
		action.moveByOffset(0, -50).perform();
		action.release().perform();
		
		action.clickAndHold().perform();
		action.moveByOffset(-50, 0).perform();
		action.release().perform();
		
		action.moveByOffset(50, 0).perform();
		action.moveByOffset(0, -50).perform();
		
		//R
		
		action.moveByOffset(50, 0).perform();
		
		action.clickAndHold().perform();
		action.moveByOffset(0, 100).perform();
		action.release().perform();
		
		action.clickAndHold().perform();
		action.moveByOffset(0, -100).perform();
		action.release().perform();
		
		action.clickAndHold().perform();
		action.moveByOffset(50, 0).perform();
		action.release().perform();
		
		action.clickAndHold().perform();
		action.moveByOffset(0, 50).perform();
		action.release().perform();
		
		action.clickAndHold().perform();
		action.moveByOffset(-50, 0).perform();
		action.release().perform();
		
		action.clickAndHold().perform();
		action.moveByOffset(50, 50).perform();
		action.release().perform();
		
		action.moveByOffset(0, -100).perform();
		
		//K
		
		action.moveByOffset(50, 0).perform();
		
		action.clickAndHold().perform();
		action.moveByOffset(0, 100).perform();
		action.release().perform();
		
		action.clickAndHold().perform();
		action.moveByOffset(0, -50).perform();
		action.release().perform();
		
		action.clickAndHold().perform();
		action.moveByOffset(50, -50).perform();
		action.release().perform();
		
		
		action.moveByOffset(-50, 0).perform();
		
		action.moveByOffset(0, 50).perform();
		
		action.clickAndHold().perform();
		action.moveByOffset(50, 50).perform();
		action.release().perform();
		
		
		

		
		
		

		
		
		

		
		
		
		
		

		

		
		

		
		

		
		
		
		
		
		
		
		

	}
}
