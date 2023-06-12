package com.multipleWindowHandles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.dateofbirthcalculator.DateOfBirthCalculator;

public class MultipleWindowsHandles extends DateOfBirthCalculator{

	
	@SuppressWarnings("deprecation")
	public static void WINDOW() {
		// TODO Auto-generated method stub
		
		driver.get("http://the-internet.herokuapp.com/windows");
driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
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
	   try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	   driver.switchTo().window(mainwindow);
	  System.out.println(driver.getTitle()); 
	    
	     
		
		
	}

}
