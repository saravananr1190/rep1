package org.first.maven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstMavenProject {


	public static void main(String[] args) throws AWTException {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\SampleMaven\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/ref=nav_logo");
		d.manage().window().maximize();
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus 6");
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		List<WebElement> li  = d.findElements(By.xpath("//span[@class='textContainer__text']"));
		
		for(WebElement e : li)
		{
			System.out.println(e.getText());
			
		}
		


	}

}
