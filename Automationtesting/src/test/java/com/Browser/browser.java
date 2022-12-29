package com.Browser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class browser {
	
	 

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir")+"/driver/chromedriver";
		System.setProperty("webdriver.chrome.driver",path);

		driver=new ChromeDriver();
		
		driver.get("https://www.calculator.net/age-calculator.html");
		
		driver.manage().window().maximize();
		
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 1000)");   
        
        Select objSelect =new Select(driver.findElement(By.id("today_Month_ID")));
         
        objSelect.selectByVisibleText("Jul");
        Select objSelect1 =new Select(driver.findElement(By.id("today_Day_ID")));
        
        objSelect1.selectByVisibleText("25");
      WebElement year=  driver.findElement(By.id("today_Year_ID"));
      
    // Actions act=new Actions(driver);
    // act.sendKeys(args)
      year.click();
      year.sendKeys(Keys.COMMAND+"a");
      year.sendKeys(Keys.DELETE);
      year.sendKeys("1999");
      
    WebElement calculate=  driver.findElement(By.xpath("//input[@value='Calculate']"));
    calculate.click();
    TakesScreenshot scrShot =((TakesScreenshot)driver);
    File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
    String filepath=System.getProperty("user.dir")+"//screenshot//test"+".png";
    File Dest=new File(filepath);
    FileUtils.copyFile(SrcFile, Dest);

    System.out.println("test pass");
    
      
        
        
		
		
		

	}

}
