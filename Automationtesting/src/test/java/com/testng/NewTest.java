package com.testng;

import org.testng.annotations.Test;

import com.dateofbirthcalculator.DateOfBirthCalculator;
import com.dropdownhandling.Dropdown;
import com.multipleWindowHandles.MultipleWindowsHandles;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class NewTest extends DateOfBirthCalculator {
  @Test(priority = 0)
  public void Auto1() {
	
	  DateOfBirthCalculator.DateofBirth();
	  

	  
	  
  }
  @Test(priority = 1)

  public void Auto2() {
	  
	  Dropdown.drop();
	  

	  
	  
  }
  
  /*@Test(priority = 2)

  public void Auto3() {
	  
	  MultipleWindowsHandles.WINDOW();*/
	  

	  
	  
  
  
  @BeforeClass
  public void beforeTest() {
	  
	  DateOfBirthCalculator.driverpath();
	  
  }

  @AfterClass
  public void afterTest() {
	  
	  driver.quit();
	  
	  System.out.println("Test Pass");
	  
  }

}
