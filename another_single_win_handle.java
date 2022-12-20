package com.selenium.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class another_single_win_handle {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\V.VIDHYA\\eclipse-workspace\\Selenium Java Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement button =  driver.findElement(By.xpath("(//span[text()='All'])[2]"));
    	Actions a = new Actions(driver);
    	a.click(button).build().perform();
    	
    	WebElement right_clk =  driver.findElement(By.xpath("//div[text()='Amazon Music']"));
    	Actions a1 = new Actions(driver);
    	a1.contextClick(right_clk).build().perform();
    	
    	Robot r = new Robot();
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);

    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	
    	Thread.sleep(2000);
    	
    	r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER);
    	
    	
    	   String current_id = driver.getWindowHandle();
        System.out.println(current_id);
           Set<String> all_id = driver.getWindowHandles();   
        System.out.println(all_id);
           for (String each_id : all_id) {
    		if(each_id.equals(current_id)) {
    			continue;
    		}
    		else {
    			driver.switchTo().window(each_id);
    			System.out.println(driver.getCurrentUrl());
    		}
    	}
	}
}