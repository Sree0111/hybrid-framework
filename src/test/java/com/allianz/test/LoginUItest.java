package com.allianz.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUItest {

	@Test()
	public void titleTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		String actualTitle=driver.getTitle();
		System.out.println("title+++");
		Assert.assertEquals(actualTitle, "OrnageHRM");
		
	}
	@Test(priority = 1)
	public void methodTest(){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		String actualVersion=driver.findElement(By.xpath("//div[@class='orangehrm-copyright-wrapper']/p[1]")).getText();
		System.out.println(actualVersion);
		Assert.assertEquals(actualVersion, "OrangeHRM OS 5.6.1");
	}
}
