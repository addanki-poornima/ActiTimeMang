/**
 * 
 */
package com.actiTime.generic;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * @author Poornima
 *
 */
public class GenericUtils {

	public static void takeScreenShot(WebDriver driver,String name) {
		TakesScreenshot ts=(TakesScreenshot)driver;
	   File src=ts.getScreenshotAs(OutputType.FILE);
	   File dest=new File("/ActiTimeMang/src/test/resources/screenshots/+img1.jpg");
	   try {
		FileUtils.copyFile(src, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
}
