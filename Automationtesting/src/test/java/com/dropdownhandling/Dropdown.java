package com.dropdownhandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.dateofbirthcalculator.DateOfBirthCalculator;

public class Dropdown extends DateOfBirthCalculator{
	
	

	@SuppressWarnings("deprecation")
	public static void drop() {
		
		// TODO Auto-generated method stub
		//ChromeOptions option =new ChromeOptions();
		//option.addArguments("--remote-allow-origins=*");
				
		//driver=new ChromeDriver(option);
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Select dropdown =new Select(driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select")));
		dropdown.selectByValue("IND");
		
	
		
		

	}

}
