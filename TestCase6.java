package testcases2;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
//Negative Scenario's
import org.testng.annotations.Test;

import consts.Consts;
import coreops.Basepage;
import excelRead.ExcelOperations;
import reports.Logs;
@Test
public class TestCase6 extends Basepage {
	
	public void invalidLogin()  throws InvalidFormatException, IOException {
		
		 ExcelOperations eo = new ExcelOperations(Consts.Sheetname);
		try {
			driver.findElement(By.id(eo.getData(5, 1))).sendKeys(eo.getData(63, 1));
			Logs.info("Username Entered");
		} catch (Exception e) {
			Logs.error("Invalid username entered");
			e.printStackTrace();
		}
		

	//password
		
		driver.findElement(By.id(eo.getData(6, 1))).sendKeys(eo.getData(64, 1));
		Logs.info("Password Entered");
		//Sign in button
		
		
			try {
				driver.findElement(By.xpath(eo.getData( 4, 1))).click();
				Assert.assertEquals(driver.findElement(By.xpath(eo.getData( 58, 1))).getText(),"Logout");
				 
			} catch (Exception e) {
				
				File ScreenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	            FileUtils.copyFile(ScreenshotFile, new File(Consts.Screenshotpath));
				  
	           e.printStackTrace();
				Logs.error("Login unsuccessful");
			}
			
			//invalid un,blank pw
			/*try {
				driver.findElement(By.id(eo.getData(5, 1))).sendKeys(eo.getData(14, 1));
				Assert.assertEquals(driver.findElement(By.xpath(eo.getData( 58, 1))).getText(),"Logout");
			} catch (Exception e) {
				;
				e.printStackTrace();
			}
			

		//password blank
			
			driver.findElement(By.id(eo.getData(6, 1))).sendKeys(eo.getData(70, 1));
			Logs.info("Password Entered");
			//Sign in button
			
				try {
					driver.findElement(By.xpath(eo.getData( 4, 1))).click();
					Assert.assertEquals(driver.findElement(By.xpath(eo.getData( 58, 1))).getText(),"Logout");
				} catch (Exception e) {
					       
			    File ScreenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	            FileUtils.copyFile(ScreenshotFile, new File(Consts.Screenshotpath));
					e.printStackTrace();
					Logs.error("Invalid Password entered");
				}*/

			
			
			//Valid un Invalid pw
			/*	try {
			driver.findElement(By.id(eo.getData(5, 1))).sendKeys(eo.getData(75, 1));
			Logs.info("Username Entered");
		} catch (Exception e) {
			Logs.error("Invalid username entered");
			e.printStackTrace();
		}
		

	//password
		
		driver.findElement(By.id(eo.getData(6, 1))).sendKeys(eo.getData(8, 1));
		Logs.info("Password Entered");
		//Sign in button
		
			try {
				driver.findElement(By.xpath(eo.getData( 4, 1))).click();
				Assert.assertEquals(driver.findElement(By.xpath(eo.getData( 58, 1))).getText(),"Logout");
			} catch (Exception e) {
				File ScreenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	            FileUtils.copyFile(ScreenshotFile, new File(Consts.Screenshotpath));
				e.printStackTrace();
			}
		*/

	
			
			
			
}
}

