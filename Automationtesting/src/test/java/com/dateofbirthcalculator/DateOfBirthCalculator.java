package com.dateofbirthcalculator;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;



public class DateOfBirthCalculator{
	public static WebDriver driver;

	public static void driverpath() {
		
		String path=System.getProperty("user.dir")+"/driver/chromedriver";
		System.setProperty("webdriver.chrome.driver",path);
		
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		driver=new ChromeDriver(option);

	}
	@SuppressWarnings("deprecation")
	public static void DateofBirth() {
		// TODO Auto-generated method stub
		
		//ChromeOptions option =new ChromeOptions();
		//option.addArguments("--remote-allow-origins=*");

		
		driver.get("https://www.calculator.net/age-calculator.html");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
        //JavascriptExecutor js = (JavascriptExecutor)driver;  
        //js.executeScript("scrollBy(0, 1000)");   
        
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
    try {
		FileUtils.copyFile(SrcFile, Dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

   // System.out.println("test pass");
    
      
        
        
		
		
		

	}

}
