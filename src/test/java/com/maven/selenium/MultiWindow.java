package com.maven.selenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;



public class MultiWindow {

	@Test 
	public static void t1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demoqa.com/frames-and-windows/");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
		driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a ")).click();
		Set <String> allwindow=driver.getWindowHandles();
		Iterator <String>it= allwindow.iterator();
		String ParentWin= it.next();
        driver.switchTo().window(ParentWin);
        driver.findElement(By.xpath(".//*[@id='menu-item-66']/a")).click();
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath(".//*[@id='menu-item-153']/a"))).click().perform(); 
        driver.close();

	}



}
