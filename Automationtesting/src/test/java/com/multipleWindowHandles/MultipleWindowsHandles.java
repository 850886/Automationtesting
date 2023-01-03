package com.multipleWindowHandles;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MultipleWindowsHandles {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String path=System.getProperty("user.dir")+"/driver/chromedriver";
		System.setProperty("webdriver.chrome.driver",path);
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/windows");
	    WebElement link=driver.findElement(By.xpath("//a[contains(@href,'/windows/new')]"));
	    link.click();
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


	   String mainwindow =driver.getWindowHandle();
	  /*Set <String> i= driver.getWindowHandles();
	  Iterator<String>s=i.iterator();
	  
	  while(s.hasNext())
	  {
		  String childwin=s.next();
		  
		  if (!mainwindow.equals(childwin)){
			  
			  driver.switchTo().window(childwin);
			  
			  System.out.println(driver.getTitle());
			  
			  String actual=driver.getTitle();
			  
			  String ExpectedTitle="New Window";
			  
			  Assert.assertEquals(actual,ExpectedTitle);
			  
			  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			  
			 System.out.println("pass");
			 
			// driver.close();
			  
			  
			  
		  }
		  
	  }*/
	  for (String data:driver.getWindowHandles()) {
	   driver.switchTo().window(data);
		   
	  }
	   Thread.sleep(5000);

	   driver.switchTo().window(mainwindow);
	  System.out.println(driver.getTitle()); 
	   System.out.println("test pass");
	    
	     
		
		
	}

}
